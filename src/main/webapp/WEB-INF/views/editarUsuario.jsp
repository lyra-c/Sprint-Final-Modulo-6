<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>Editar Usuario</title>
</head>
<body>
    <h2>Editar Usuario</h2>
<form:form method="post" action="${pageContext.request.contextPath}/usuarios/editar" modelAttribute="usuario">
    <form:hidden path="id" value="${usuario.id}" />
    <form:hidden path="tipoUsuario" value="${usuario.tipoUsuario}" /> <!-- Campo oculto para tipoUsuario -->
    
    <div>
        <label>Nombre:</label>
        <form:input path="nombre" value="${usuario.nombre}" required="true"/>
    </div>
    <div>
        <label>Password:</label>
        <form:input path="passwordUsuario" value="${usuario.passwordUsuario}" required="true"/>
    </div>
    <div>
        <label>RUT:</label>
        <form:input path="rutUsuario" value="${usuario.rutUsuario}" required="true"/>
    </div>
    <div>
        <label>Fecha de Nacimiento:</label>
        <form:input path="fechaNacimiento" value="${usuario.fechaNacimiento}" required="true"/>
    </div>
    <div>
        <label>Sexo:</label>
        <form:input path="sexo" value="${usuario.sexo}" required="true"/>
    </div>

    <!-- Campos adicionales según el tipo de usuario -->
    <c:choose>
        <c:when test="${usuario.tipoUsuario == 'Cliente'}">
            <div>
                <label>Nombre Empresa:</label>
                <form:input path="nombreEmpresa" value="${usuario.nombreEmpresa}" />
            </div>
            <div>
                <label>Dirección:</label>
                <form:input path="direccion" value="${usuario.direccion}" />
            </div>
            <div>
                <label>Teléfono Contacto:</label>
                <form:input path="telefonoContacto" value="${usuario.telefonoContacto}" />
            </div>
        </c:when>
        <c:when test="${usuario.tipoUsuario == 'Profesional'}">
            <div>
                <label>Título:</label>
                <form:input path="titulo" value="${usuario.titulo}" />
            </div>
            <div>
                <label>Fecha de Ingreso:</label>
                <form:input path="fechaIngreso" value="${usuario.fechaIngreso}" />
            </div>
        </c:when>
        <c:when test="${usuario.tipoUsuario == 'Administrativo'}">
            <div>
                <label>Área:</label>
                <form:input path="area" value="${usuario.area}" />
            </div>
            <div>
                <label>Experiencia Previa:</label>
                <form:input path="experienciaPrevia" value="${usuario.experienciaPrevia}" />
            </div>
        </c:when>
    </c:choose>

    <div>
        <input type="submit" value="Actualizar Usuario" />
    </div>
</form:form>

    <a href="${pageContext.request.contextPath}/usuarios/crear">Volver a la lista de usuarios</a>
</body>
</html>
