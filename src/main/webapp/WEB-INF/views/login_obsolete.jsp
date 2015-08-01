<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>           
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Page</title>
</head>
<body onload='document.f.j_username.focus();'> 
 <p>Hello welcome...Now start developing the login form</p>
 <form name='f' action='/login/j_spring_security_check' method='POST'>
		
 
 <table>
 	<tr>
 		<td>Enter user ID and password</td>
 	</tr>
 	<tr>
 		<td>
 			User ID 
 		</td>
 		<td>
 			<input type='text' name='j_username' value=''/>
 		</td>
 	</tr>
 	<tr>
 		<td>
 			Password
 		</td>
 		<td>
 			<input type='password' name="j_password"/>
 		</td>
 	</tr>
 	<tr>
 	     <td colspan="2">
             <input name='submit' type="submit" value="Login" />
         </td>
 	</tr>
 </table>
</form>
</body>
</html>