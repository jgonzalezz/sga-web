<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado personas</title>
</head>
<body>
	<h1>Listado de Personas</h1>
	<table>
		<tr>
			<th>Nombre</th>
			<th>Apellido Paterno</th>
			<th>Email</th>
		</tr>

		<c:forEach items="${personas}" var="persona">
			<tr>
				<td>${persona.nombre}</td>
				<td>${persona.apePaterno}</td>
				<td>${persona.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>