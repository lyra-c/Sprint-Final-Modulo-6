<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<!-- Integrantes: Diego Rivera - Beatriz Maldonado - Jorge Lira - Jorge Montoya - Felipe Martínez - Sammy Maldonado  -->
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Crear Nueva Capacitación - Sistema de Información de
	Prevención de Riesgos</title>
<!-- CDN Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	

</head>
<body>
	<%@ include file='navbar.jsp'%>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-8 col-lg-6">
				<div class="bg-white p-4 rounded shadow-sm">
					<h1 class="text-center mb-4 display-5">Crear Nueva
						Capacitación</h1>

					<c:if test="${not empty mensaje}">
						<div class="alert alert-success">${mensaje}</div>
					</c:if>
					<form action="${pageContext.request.contextPath}/capacitaciones/crear" method="post">
						<div class="mb-3">
							<label for="nombre" class="form-label">Nombre:</label> <input
								type="text" class="form-control" id="nombre"
								name="nombre" placeholder="Ingrese su nombre" required>
						</div>
						<div class="mb-3">
							<label for="rut" class="form-label">RUT:</label> <input
								type="text" class="form-control" id="rut" name="rutCliente"
								placeholder="Ingrese su rut" required>
						</div>
						<div class="mb-3">
							<label for="dia" class="form-label">Día:</label> <input
								type="date" class="form-control" id="dia" name="dia" required>
						</div>
						<div class="mb-3">
							<label for="hora" class="form-label">Hora:</label> <input
								type="time" class="form-control" id="hora" name="hora" required>
						</div>
						<div class="mb-3">
							<label for="lugar" class="form-label">Lugar:</label> <input
								type="text" class="form-control" id="lugar" name="lugar"
								placeholder="Ingrese el lugar de la capacitación" required>
						</div>
						<div class="mb-3">
							<label for="duracion" class="form-label">Duración
								(horas):</label> <input type="number" class="form-control" id="duracion"
								name="duracion"
								placeholder="Ingrese en horas la duración de la capacitación"
								required>
						</div>
						<div class="mb-3">
							<label for="cantidad_asistentes" class="form-label">Cantidad
								de Asistentes:</label> <input type="number" class="form-control"
								id="cantidad_asistentes" name="asistentes"
								placeholder="Ingrese en números la cantidad de asistentes"
								required>
						</div>
						<div class="text-center">
							<button type="submit" id="botonEnvio" class="btn btn-primary">Crear
								Capacitación</button>
						</div>
					</form>
					<div id="mensajeAlerta" class="mt-4 d-none">
						<div class="alert alert-success alert-dismissible fade show"
							role="alert">
							<strong>Listo!</strong> La capacitación se ha creado de manera
							exitosa.
							<button type="button" class="btn-close" aria-label="Close"
								onclick="mensajeAlerta()"></button>
						</div>
					</div>
					<div class="text-center mt-4">
						<a href="${pageContext.request.contextPath}/" class="btn btn-secondary">Volver al Inicio</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<%@ include file='footer.jsp'%>


	<!-- Script -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	<script>
		document.getElementById('botonEnvio').addEventListener(
				'click',
				function() {
					document.getElementById('mensajeAlerta').classList
							.remove('d-none');
				});

		function cierreAlerta() {
			document.getElementById('mensajeAlerta').classList.add('d-none');
		}
	</script>
</body>
</html>
