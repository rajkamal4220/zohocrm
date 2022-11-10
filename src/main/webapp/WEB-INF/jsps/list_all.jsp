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
<a href ="viewnewleadpage">new lead</a>
	<h2>list all leads</h2>
	<table>
		<tr>
			<th>firstname</th>
			<th>lastname</th>
			<th>email</th>
			<th>mobile</th>
			<th>source</th>
		</tr>
		<c:forEach var="leads" items="${leads}">
			<tr>
				<td><a href="leadinfo?id=${leads.id}">${leads.firstname}</a></td>
				<td>${leads.lastname}</td>
				<td>${leads.email}</td>
				<td>${leads.mobile}</td>
				<td>${leads.source}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>