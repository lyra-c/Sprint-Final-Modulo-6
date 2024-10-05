<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

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
		<h1 class="text-center display-5">Sistema de Información de
			Prevención de Riesgos</h1>
		<p class="text-center">Bienvenido al portal de administración de
			procesos</p>

		<div class="text-center mt-4">
			<img
				src="https://media.istockphoto.com/id/1328114467/es/vector/personajes-masculinos-y-femeninos-cubiertos-por-la-seguridad-del-seguro.jpg?s=612x612&w=0&k=20&c=97hkUOXjZ9MS-XxDr9D3sEkm7o5A2grhIo7D3oKv8B0="
				alt="Imagen descriptiva" class="imagenCentral">
			<p>En este portal podrás gestionar todas las actividades
				relacionadas con la prevención de riesgos en tu empresa. Selecciona
				una de las opciones para comenzar.</p>
		</div>
		<div class="text-center mt-4">
			<a href="./contacto" class="btn btn-primary m-2">Contacto</a> <a
				href="${pageContext.request.contextPath}/capacitaciones" class="btn btn-secondary m-2">Crear
				Capacitación</a>
		</div>

	</div>

	<!-- Footer -->
	<%@ include file='footer.jsp'%>

	<!-- Script -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
