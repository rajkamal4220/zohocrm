<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>details</title>
</head>
<body>
	<h2>Lead Details</h2>
	firstname: ${lead.firstname}
	<br /> lastname: ${lead.lastname}
	<br /> emai: ${lead.email}
	<br /> mobile: ${lead.mobile}
	<br /> source: ${lead.source}
	<br />
	<form action="sendEmail" method="post">
		<input type="hidden" name="email" value="${lead.email}" /> 
		<input type="submit" value="send mail" />
	</form>
	<form  action="convertlead" method="post">
	<input type="hidden" name="id" value="${lead.id}" />
		<input type="submit" value="convert" />
	</form>
</body>
</html>