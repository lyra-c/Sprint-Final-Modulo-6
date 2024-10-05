<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Checklist</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	
</head>
<body>
	<%@ include file='navbar.jsp'%>
	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-8 col-lg-6">
				<div class="bg-white p-4 rounded shadow-sm">
					<h1 class="text-center mb-4 display-5">Crear Checklist</h1>

					<c:if test="${not empty mensaje}">
						<div class="alert alert-success">${mensaje}</div>
					</c:if>
					<form action="${pageContext.request.contextPath}/checklist/crearChecklist" method="post">
						<div class="mb-3">
							<label for="cliente_id" class="form-label">ID  VISITA:</label>
							<input type="number" class="form-control" id="visitaId" name="visitaId" placeholder="Ingrese de la visita" required>
						</div>
						<div class="mb-3">
							<label for="detalle" class="form-label">DETALLE DE LA VISITA:</label>
							<input type="text" class="form-control" id="detalle" name="detalle" required>
						</div>
						<div class="mb-3">
							<label for="estado" class="form-label">ESTADO DE LA VISITA:</label>
							<input type="text" class="form-control" id="estado" name="estado" required>
						</div>
						<div class="text-center">
							<button type="submit" id="botonEnvio" class="btn btn-primary">Crear Checklist de la visita</button>
						</div>
					</form>
					<div id="mensajeAlerta" class="mt-4 d-none">
						<div class="alert alert-success alert-dismissible fade show" role="alert">
							<strong>Listo!</strong> El Checklist se ha creado de manera exitosa.
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
	
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
