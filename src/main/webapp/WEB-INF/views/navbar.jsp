<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- CDN Bootstrap -->
<title>Sistema de Información de Prevención de Riesgos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand fw-semibold fs-4"
					href="${pageContext.request.contextPath}/">Sistema de
					Prevención de Riesgos</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link text-white"
							href="${pageContext.request.contextPath}/">Inicio</a></li>
						
						<!-- Capacitaciones -->
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('CLIENTE')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/capacitaciones/crear">CrearCapacitación</a>
						    </sec:authorize>
						</li>	
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('CLIENTE')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/capacitaciones/listar">Listar Capacitaciones</a>
						    </sec:authorize>
						</li>	

						<!-- Contacto -->
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('CLIENTE')">
							    <a class="nav-link text-white" href="${pageContext.request.contextPath}/contacto">Contacto</a>
							</sec:authorize>
						</li>
						
						<!-- Usuarios -->
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('ADMINISTRATIVO')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/usuarios/listar">Usuarios</a>
						    </sec:authorize>
						</li>	
						
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('ADMINISTRATIVO')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/usuarios/crear">Crear Usuario</a>
						    </sec:authorize>
						</li>	
						
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('ADMINISTRATIVO')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/usuarios/editar">Editar Usuario</a>
						    </sec:authorize>
						</li>	
							
						<!-- Visitas -->				
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('ADMINISTRATIVO')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/visita/crearVisita">Registrar Visita</a>
						    </sec:authorize>
						</li>	
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('ADMINISTRATIVO')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/visita/listarVisitas">Listar Visitas</a>
						    </sec:authorize>
						</li>	
							
						<!-- Checklist -->							
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('PROFESIONAL')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/checklist/crearChecklist">Checklist</a>
						    </sec:authorize>
						</li>
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('PROFESIONAL')">
						        <a class="nav-link text-white"href="${pageContext.request.contextPath}/checklist/listarChecklist">Listar Checklist</a>
						    </sec:authorize>
						</li>	
							
						<!-- Pagos  -->
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('ADMINISTRATIVO')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/pagos/crear">Crear Pago</a>
						    </sec:authorize>
						</li>
						<li class="nav-item">
						    <sec:authorize access="hasAuthority('ADMINISTRATIVO')">
						        <a class="nav-link text-white" href="${pageContext.request.contextPath}/pagos">Listar Pagos</a>
						    </sec:authorize>
						</li>
						
					</ul>
					
					<!-- Validaciones de autentificación de sesión -->
					<sec:authorize access="!isAuthenticated()">
						<a href="${pageContext.request.contextPath}/login" class="btn btn-success my-2 fw-semibold">Ingresar</a>
					</sec:authorize>
					
					<sec:authorize access="isAuthenticated()">
						<a href="${pageContext.request.contextPath}/logout" class="btn btn-danger my-2 fw-semibold">Cerrar sesión</a>
					</sec:authorize>
					
				</div>

			</div>
		</nav>
	</header>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
