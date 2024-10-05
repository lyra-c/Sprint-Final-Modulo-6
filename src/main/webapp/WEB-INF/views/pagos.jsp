<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado de Pagos</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	
</head>
<%@ include file="navbar.jsp" %>
<body>

<div class="container mt-5">
    <h2 class="text-center mb-4">Listado de Pagos</h2>
    
    <div class="table-responsive">
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Monto</th>
                    <th>Fecha</th>
                    <th>RUT Cliente</th>
                    <th>Capacitación</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="pago" items="${listapagos}">
                    <tr>
                        <td>${pago.id}</td>
                        <td>${pago.monto}</td>
                        <td>${pago.fecha}</td>
                        <td>${pago.rutCliente}</td>
                        <td>${pago.capacitacion}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="text-center mt-4 mb-5">
        <a href="${pageContext.request.contextPath}/pagos/crear" class="btn btn-primary">Agregar Pago</a>
    </div>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<%@ include file="footer.jsp" %>

</body>
</html>
