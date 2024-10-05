<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- Integrantes: Diego Rivera - Beatriz Maldonado - Jorge Lira - Jorge Montoya - Felipe Mart�nez - Sammy Maldonado -->
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Inicio - Sistema de Información  de Prevención  de Riesgos</title>
<!-- CDN Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	
</head>
<body>
	<%@ include file='navbar.jsp'%>
	
	<div class="container mt-5">
		<h1 class="text-center mb-4 fw-semibold">Listado de Checklist</h1>
		<table class="table table-striped">
			<thead>
            <tr>
                <th>ID Checklist</th>
                <th>ID Visita </th>
                <th>Detalle de la Visita</th>
                <th>Estado</th>
                
            </tr>
        </thead>
        <tbody>
    <c:forEach var="checklist" items="${checklist}">
        <tr>
            <td>${checklist.id}</td>
            <td>${checklist.visitaId}</td>
            <td>${checklist.detalle}</td>
            <td>${checklist.estado}</td>
            <td>
                <!-- Enlace para eliminar el checklist -->
                <a href="${pageContext.request.contextPath}/checklist/eliminar/${checklist.id}" class="btn btn-danger">Eliminar</a>

            </td>
        </tr>
    </c:forEach>
</tbody>
    </table>
    <div class="text-center">
	            <a href="${pageContext.request.contextPath}/"  class="btn btn-primary m-2">Inicio</a>
	            <a href="${pageContext.request.contextPath}/checklist/crearChecklist" class="btn btn-secondary m-2">Registrar Nuevo Checklist</a>
	            
	    </div>

    
	
	<!-- Footer -->
	<%@ include file='footer.jsp'%> 
	
		<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>