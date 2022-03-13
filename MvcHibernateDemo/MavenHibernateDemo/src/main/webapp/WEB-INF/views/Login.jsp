<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="loginCheck" method="post">
		<table align="center">
			
			<tr bgcolor="gray">
				<td colspan="2">
					<center>LOGIN DIALOG</center>
				</td>
			</tr>
			<tr>
				<td><label>User Name</label></td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="passwd" /></td>
			</tr>
			<tr bgcolor="gray">
				<td colspan="2"><input type="submit" value="LOGIN" /></td>
			</tr>
		</table>
	</form>

</body>
</html>