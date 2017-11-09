<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List"%>
<%@page import="com.qualitas.entities.Cliente"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	td{
		border: 1px solid gray;
		padding: 5px;
	}
	tabvle{
		border-collapse: collapse;
	}
</style>
</head>
<body>

<h1>Cat�logo de clientes</h1>
<h2>Clientes encontrados:
	<%
		List<Cliente> clientes =(List<Cliente>)session.getAttribute("clientes");
		out.println(clientes.size());
	%>
	<table>
		<%
			for (Cliente cliente:clientes){
				out.println("<tr>");
				out.println("<td>");
				out.println(cliente.getNombre());
				out.println("</td>");
				out.println("<td>");
				out.println(cliente.getDireccion());
				out.println("</td>");
				out.println("<td>");
				out.println(cliente.getPoliza().getNumero());
				out.println("</td>");				
				out.println("</tr>");				
			}
		%>
	</table>
</h2>

</body>
</html>