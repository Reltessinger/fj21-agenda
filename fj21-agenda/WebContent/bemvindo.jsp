<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<% String mensagem = "Bem vindo ao sistema de agenda do FJ-21!"; %>
		<% out.println(mensagem); %>
	</h1>
	
	<br />
	
	<h2>
		<% String desenvolvido = "Desenvolvido por Rafael Reltessinger"; %>
		<% out.println(desenvolvido); %>
			
		
	</h2>
		
	<br />
		<% System.out.println("Tudo foi Executado!"); %>
</body>
</html>