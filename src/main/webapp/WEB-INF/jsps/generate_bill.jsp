
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>generate bill</title>
</head>
<body>
	<h2>Create new bill</h2>
	<form action="savebillingdata" method="post">
	<pre>
	firstname<input type="text" name="firstname" value="${contact.firstname}"/>
	lastname<input type="text" name="lastname" value="${contact.lastname}"/>
	email<input type="text" name="email" value="${contact.email}"/>
	mobile<input type="text" name="mobile" value="${contact.mobile}"/>
	product<input type="text" name="product"/>
	amount<input type="text" name="amount"/>
       <input type="submit" value="generatebill"/>
	</pre>
	
	
	</form>
</body>
</html>