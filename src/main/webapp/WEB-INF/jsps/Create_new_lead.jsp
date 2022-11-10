
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
	<h2>Create new Lead</h2>
	<form action="save" method="post">
	<pre>
	firstname<input type="text" name="firstname"/>
	lastname<input type="text" name="lastname"/>
	email<input type="text" name="email"/>
	mobile<input type="text" name="mobile"/>
	source:
	<select name="source" >
  <option value="TV">TV</option>
  <option value="newspaper">newspaper</option>
  <option value="showtrade">showtrade</option>
  <option value="ADS">ADS</option>
</select>
<input type="submit" value="save"/>
	</pre>
	
	
	</form>
</body>
</html>