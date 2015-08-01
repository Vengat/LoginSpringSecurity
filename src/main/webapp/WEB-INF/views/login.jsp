<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>           
<div>
<h2>Log in</h2>
<form method="post" class="signin" action="/login/j_spring_security_check">
	￼￼<fieldset>
		<table>
			<tr>
				<th><label for="username_or_email">User name or Email</label></th>
				<td><input id="username_or_email" name="j_username" type="text" /></td>
			</tr>
			<tr>
				<th><label for="password">Password</label></th>
  				<td><input id="password" name="j_password" type="password" />
      			<small><a href="/account/resend_password">Forgot?</a></small></td></tr>
			 <tr>
				<th></th>
				<td><input id="remember_me" name="_spring_security_remember_me" type="checkbox"/>
                <label for="remember_me" class="inline">Remember me</label></td>  
    		 </tr>
    		 <tr>
                <th></th>
                     <td><input name="commit" type="submit" value="Sign In" /></td>
             </tr>
        </table>
      </fieldset>
   </form>
   
   <script type="text/javascript">
    document.getElementById('username_or_email').focus();
   </script>
</div>