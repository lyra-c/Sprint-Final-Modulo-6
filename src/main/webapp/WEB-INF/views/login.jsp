<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio - Sistema de Información de Prevención de Riesgos</title>
    
    <!-- CDN Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/res/css/estilo.css" type="text/css">
</head>
<body class="bg-body-secondary">

    <div class="container my-5">
        <div class="row justify-content-center">
            <div class="col-lg-6">
                
                <!-- Card for Login Form -->
                <div class="card shadow-sm">
                    <div class="card-header bg-dark text-white text-center">
                        <h3 class="mb-0">Sistema de Información de Prevención de Riesgos</h3>
                    </div>
                    <div class="card-body p-4">
                        <h4 class="text-center fw-semibold mb-4">Iniciar Sesión</h4>

						<table>
		<h4>Credenciales de acceso desde la base de datos:</h4>
		<tr>
			<th>Usuario</th>
			<th>Rut</th>
			<th>Rol</th>
			<th>Contraseña</th>
		</tr>
		
		<tr>
			<td>Jacinto Duarte</td>
			<td>12345678-9</td>
			<td>CLIENTE</td>
			<td>123456</td>
		</tr>
		
		<tr>
			<td>Aurelio Flores</td>
			<td>18765432-1</td>
			<td>ADMINISTRATIVO</td>
			<td>123456</td>
		</tr>
		
		<tr>
			<td>Casimiro Monsalves</td>
			<td>25678901-2</td>
			<td>PROFESIONAL</td>
			<td>123456</td>
		</tr>
		
		<tr>
			<td>user1</td>
			<td>23748265-3</td>
			<td>ADMINISTRATIVO</td>
			<td>123456</td>
		</tr>
		</table>

                        <!-- Logic for Authentication Error -->
                        <%
                        String error = (String) request.getAttribute("error");
                        if (error != null && error.equals("true")) {
                            out.println("<div class='alert alert-danger text-center'>Error de Autenticación</div>");
                        }
                        %>

                        <!-- Login Form -->
                        <form name="loginForm" action="${pageContext.request.contextPath}/login" method="post">
                            <div class="mb-3">
                                <label for="username" class="form-label">Rut</label>
                                <input type="text" name="username" class="form-control" placeholder="Ingrese su RUT" required>
                            </div>
                            <div class="mb-3">
                                <label for="password" class="form-label">Contraseña</label>
                                <input type="password" name="password" class="form-control" placeholder="Ingrese su contraseña" required>
                            </div>
                            <div class="d-grid gap-2">
                                <button type="submit" class="btn btn-primary fw-semibold">Ingresar</button>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer text-muted text-center">
                        © 2024 Sistema de Información de Prevención de Riesgos
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <%@ include file='footer.jsp'%>

    <!-- Script -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
