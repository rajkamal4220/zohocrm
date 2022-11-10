<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>list all contact leads</h2>
	<table>
		<tr>
			<th>firstname</th>
			<th>lastname</th>
			<th>email</th>
			<th>mobile</th>
			<th>source</th>
			<th>billing</th>
		</tr>
		<c:forEach var="contacts" items="${contacts}">
			<tr>
				<td>${contacts.firstname}</td>
				<td>${contacts.lastname}</td>
				<td>${contacts.email}</td>
				<td>${contacts.mobile}</td>
				<td>${contacts.source}</td>
				<td><a href="generatebill?id=${contacts.id}">billing</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>