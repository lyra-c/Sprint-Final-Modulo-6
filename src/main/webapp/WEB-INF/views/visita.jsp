<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	
</head>
<body>
	<%@ include file='navbar.jsp'%>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-8 col-lg-6">
				<div class="bg-white p-4 rounded shadow-sm">
					<h1 class="text-center mb-4 display-5">Crear Registro de Visita</h1>

					<c:if test="${not empty mensaje}">
						<div class="alert alert-success">${mensaje}</div>
					</c:if>
					<form action="${pageContext.request.contextPath}/visita/crearVisita" method="post">
						<div class="mb-3">
							<label for="cliente_id" class="form-label">CLIENTE_ID:</label>
							<input type="text" class="form-control" id="cliente_id" name="cliente_id" placeholder="Ingrese el ID del Cliente" required>
						</div>
						<div class="mb-3">
							<label for="fecha_visita" class="form-label">FECHA:</label>
							<input type="date" class="form-control" id="fecha_visita" name="fecha_visita" placeholder="fecha_visita" required>
						</div>
						<div class="mb-3">
							<label for="detalle" class="form-label">DETALLE DE LA VISITA:</label>
							<input type="text" class="form-control" id="detalle" name="detalle" required>
						</div>
						<div class="mb-3">
							<label for="profesional_id" class="form-label">ID PROFESIONAL:</label>
							<input type="Number" class="form-control" id="profesional_id" name="profesional_id" required>
						</div>
						<div class="text-center">
							<button type="submit" id="botonEnvio" class="btn btn-primary">Crear Registro de visita</button>
						</div>
					</form>
					<div id="mensajeAlerta" class="mt-4 d-none">
						<div class="alert alert-success alert-dismissible fade show" role="alert">
							<strong>Listo!</strong> La visita se ha creado de manera exitosa.
							<button type="button" class="btn-close" aria-label="Close" onclick="mensajeAlerta()"></button>
						</div>
					</div>
					<div class="text-center mt-4">
						<a href="${pageContext.request.contextPath}/" class="btn btn-secondary">Volver al Inicio</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<!-- Bootstrap JS and dependencies -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>