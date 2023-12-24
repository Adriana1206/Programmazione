<%@page import="java.util.List"%>
<%@page import="com.example.javadb.entities.Cliente"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Elenco dei clienti</title>
</head>
<body>
<h1>Elenco dei clienti</h1>

<table border="1">
<caption>Tabella clienti</caption> <!-- titolo tabella -->
<tr> <!-- table row -->
	<th>Id</th> <!-- table head cell -->
	<th>Nome</th>
	<th>Cognome</th>
	<th>E-mail</th>
	<th>Indirizzo</th>
	<th>Città</th>
	<th>Provincia</th>
	<th>CAP</th>
</tr>  
<%
// inizio codice java
List<Cliente> clienti = (List<Cliente>) request.getAttribute("elenco-clienti");


for(Cliente c : clienti) {
// fine codice java
%>
	<tr>
		<td><%=c.getIdCliente() %></td> <!-- table cell data -->
		<td><%=c.getNome() %></td>
        <td><%=c.getCognome() %></td>
        <td><%=c.getEmail() %></td>
        <td><%=c.getIndirizzo() %></td>
        <td><%=c.getCitta() %></td>
        <td><%=c.getProvincia() %></td>
        <td><%=c.getCap() %></td>
	</tr>
<%
}
%>
</table>

</body>
</html>