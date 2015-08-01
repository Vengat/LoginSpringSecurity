/**
 * 
 */
package com.auth.login.persistence.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.auth.login.persistence.domain.Role;
import com.auth.login.persistence.repository.RoleRepository;
import com.auth.login.persistence.repository.UserRepository;

/**
 * @author vramanan
 *
 */
@Service
@Transactional(readOnly=true)
public class UserValidationService implements UserDetailsService {
	
//	@Resource
//	private UserRepository userRepository;
//	
//	@Resource
//	private RoleRepository roleRepository;
	
	@Autowired
    private UserService userService; 	

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		
		try {
			//userRepository.findOne(id)
			com.auth.login.persistence.domain.User user = userService.findByUsername(username);
			boolean enabled = true;
	        boolean accountNonExpired = true;
	        boolean credentialsNonExpired = true;
	        boolean accountNonLocked = true;
	        
	        return new User(user.getUsername(),
	        		user.getPassword().toLowerCase(),
                    enabled,accountNonExpired,
                    credentialsNonExpired,
                    accountNonLocked,
                    getAuthorities(user.getRole().getId())
            );
		} catch(Exception e) {
		     e.printStackTrace();
		     throw new RuntimeException(e);
		}
}
	
	public Collection<? extends GrantedAuthority> getAuthorities(Integer role) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
	    return authList;
	}
	
	public List<String> getRoles(Integer role) {
		List<String> roles = new ArrayList<String>();
		
		if(role.intValue() == 1) {
			roles.add("ROLE_USER");
		} else if(role.intValue() == 2) {
			roles.add("ROLE_ADMIN");
		}
		return roles;		
	}
	
	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		for(String role: roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}

//	public Collection<? extends GrantedAuthority> getAuthorities(List<Role> roles){
//
//	    List<GrantedAuthority> authList = getGrantedAuthorities(getroles(roles));
//	    return authList;
//	}
//
//	public static List<GrantedAuthority> getGrantedAuthorities(List<String> userroles){
//
//	    List<GrantedAuthority> authorities  = new ArrayList<GrantedAuthority>();
//	    for(String userrole:userroles){
//	        authorities.add(new SimpleGrantedAuthority(userrole));
//	    }
//	    return authorities;
//	}
//
//	public List<String> getroles(List<Role> roles){
//
//	    List<String> userroles = new ArrayList<String>();
//
//	    for (Role role : roles){
//
//	     if(role.getRole() == 1){
//	         userroles.add("ROLE_USER");
//	     }
//	     if(role.getRole() == 2){
//	         userroles.add("ROLE_ADMIN");
//	     }
//
//	    }
//
//	    return userroles;
//	}



}
