<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<!-- Integrantes: Diego Rivera - Beatriz Maldonado - Jorge Lira - Jorge Montoya - Felipe Martínez - Sammy Maldonado -->
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Inicio - Sistema de Información de Prevención de Riesgos</title>
<!-- CDN Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	
</head>
<body>
	<%@ include file='navbar.jsp'%>
	
	<div class="container mt-5">
		<h1 class="text-center mb-4 fw-semibold">Listado de Capacitaciones
			Registradas</h1>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>RUT</th>
					<th>Día</th>
					<th>Hora</th>
					<th>Lugar</th>
					<th>Duración (horas)</th>
					<th>Cantidad de Asistentes</th>
				</tr>
			</thead>
			<!-- Se debe llenar dinámicamente con Javascript o servidor -->
			<tbody>
	
	
				<!-- Mostrar los datos enviados (si existen) -->
	
				<c:forEach var="capacitacion" items="${capacitaciones}">
					<tr>
						<td>${capacitacion.identificador}</td>
						<td>${capacitacion.nombre}</td>
						<td>${capacitacion.rutCliente}</td>
						<td>${capacitacion.dia}</td>
						<td>${capacitacion.hora}</td>
						<td>${capacitacion.lugar}</td>
						<td>${capacitacion.duracion}</td>
						<td>${capacitacion.asistentes}</td>
					<tr>
				</c:forEach>
	
			</tbody>
		</table>
		
		<div class="text-center">
	            <a href="${pageContext.request.contextPath}/"  class="btn btn-primary m-2">Inicio</a>
	            <a href="${pageContext.request.contextPath}/capacitaciones/crear" class="btn btn-secondary m-2">Crear
					Capacitación</a>
	        </div>
	</div>
	
	<!-- Footer -->
	<%@ include file='footer.jsp'%>
	
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

