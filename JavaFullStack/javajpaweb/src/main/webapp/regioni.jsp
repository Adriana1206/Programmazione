<%@page import="com.example.javadb.entities.Regione"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elenco delle regioni italiane</title>
</head>
<body>
	<h1>Elenco delle regioni italiane</h1>
	
	
	<% //Inizio codice Java
	
		List<Regione> regioni = (List<Regione>) request.getAttribute("elenco-regioni");
	
		
		for(Regione r : regioni){
	%>
	
	<p><%= r %></p>  <!-- Ripeto n volte il paragrafo -->
	<%
	}
	%>
	
</body>
</html>