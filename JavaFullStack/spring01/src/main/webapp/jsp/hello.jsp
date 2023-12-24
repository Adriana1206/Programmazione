<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%response.setContentType("text/html"); %>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<h1>Hello by JSP</h1>
	<%
	String msg = (String) request.getAttribute("messaggio");
	if(msg != null) {
	%>
	<h2><%=msg %></h2>
	<%} %>
</body>
</html>