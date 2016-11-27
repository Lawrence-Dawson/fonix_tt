<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
    <jsp:directive.page language="java"
        contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
    <jsp:text>
        <![CDATA[ <?xml version="1.0" encoding="UTF-8" ?> ]]>
    </jsp:text>
    <jsp:text>
        <![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
    </jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<H1>Fill in the details below to Sign Up</H1>
	<form action="signUp" method="post">
		<TABLE border="0">
		<tr>
			<td>Forename: </td> <td><input type="text" name="forename" /></td>
		</tr>
		<tr>
			<td>Surname: </td> <td><input type="text" name="surname" /></td>
		</tr>
		<tr>
			<td>Email Address: </td> <td><input type="text" name="email" /></td>
		</tr>
		<tr>
			<td>Email Address Confirmation: </td> <td><input type="text" name="email" /></td>
		</tr>
		<tr>
			<td>Password: </td> <td><input type="text" name="password" /></td>
		</tr>
		<tr>
			<td>Password Confirmation: </td> <td><input type="text" name="password confirmation" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
		</TABLE>
	</form>
</body>
</html>
</jsp:root>