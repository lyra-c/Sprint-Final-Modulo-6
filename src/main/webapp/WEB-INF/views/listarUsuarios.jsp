<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listado de Usuarios - Sistema de Información de Prevención de Riesgos</title>
    <!-- CDN Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <%@ include file='navbar.jsp'%>
    
    <div class="container mt-5">
        <h1 class="text-center mb-4 fw-semibold">Listado de Usuarios Registrados</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>RUT</th>
                    <th>Fecha de nacimiento</th>
                    <th>Sexo</th>
                    <th>Tipo de Usuario</th>
                    <th>Acciones</th> <!-- Nueva columna para acciones -->
                </tr>
            </thead>
            <tbody>
                <!-- Iteración sobre la lista de usuarios enviada desde el servidor -->
                <c:forEach var="usuario" items="${usuarios}">
                    <tr>
                        <td>${usuario.nombre}</td>
                        <td>${usuario.rutUsuario}</td>
                        <td>${usuario.fechaNacimiento}</td>
                        <td>${usuario.sexo}</td>
                        <td>${usuario.tipoUsuario}</td>
                        <td>
                            <!-- Botón de Editar -->
                            <a href="editar?id=${usuario.id}" class="btn btn-warning btn-sm">Editar</a>
                            
                            <!-- Botón de Eliminar -->
                            <form action="eliminarUsuario" method="post" style="display:inline;">
                                <input type="hidden" name="id" value="${usuario.id}">
                                <button type="submit" class="btn btn-danger btn-sm" onclick="return confirm('¿Estás seguro de que deseas eliminar este usuario?');">Eliminar</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <!-- Footer -->
    <%@ include file='footer.jsp'%>
</body>
</html>
