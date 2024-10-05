<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Crear Nuevo Usuario - Sistema de Información de
	Prevención de Riesgos</title>
<!-- CDN Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<%@ include file='navbar.jsp'%>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-8 col-lg-6">
				<div class="bg-white p-4 rounded shadow-sm">
					<h1 class="text-center mb-4 display-5">Crear Nuevo Usuario</h1>

					<c:if test="${not empty mensaje}">
						<div class="alert alert-success">${mensaje}</div>
					</c:if>

					<form action="${pageContext.request.contextPath}/usuarios/crear"
						method="post">
						<!-- Nombre -->
						<div class="mb-3">
							<label for="nombre" class="form-label">Nombre:</label> <input
								type="text" class="form-control" id="nombre" name="nombre"
								placeholder="Ingrese su nombre" required>
						</div>

						<!-- Contraseña -->
						<div class="mb-3">
							<label for="password" class="form-label">Contraseña:</label> <input
								type="password" class="form-control" id="passwordUsuario"
								name="passwordUsuario" placeholder="Ingrese su contraseña"
								required>
						</div>

						<!-- RUT -->
						<div class="mb-3">
							<label for="rut" class="form-label">RUT:</label> <input
								type="text" class="form-control" id="rutUsuario"
								name="rutUsuario" placeholder="Ingrese su RUT" required>
						</div>

						<!-- Fecha de Nacimiento -->
						<div class="mb-3">
							<label for="fechaNacimiento" class="form-label">Fecha de
								Nacimiento:</label> <input type="date" class="form-control"
								id="fechaNacimiento" name="fechaNacimiento" required>
						</div>

						<!-- Sexo -->
						<div class="mb-3">
							<label for="sexo" class="form-label">Sexo:</label> <select
								class="form-select" id="sexo" name="sexo" required>
								<option value="" disabled selected>Seleccione una
									opción</option>
								<option value="Hombre">Hombre</option>
								<option value="Mujer">Mujer</option>
								<option value="Prefiero no decirlo">Prefiero no decirlo</option>
							</select>
						</div>

						<!-- Tipo de Usuario -->
						<div class="mb-3">
							<label for="tipoUsuario" class="form-label">Tipo de
								Usuario:</label> <select class="form-select" id="tipoUsuario"
								name="tipoUsuario" onchange="mostrarCampos()" required>
								<option value="" disabled selected>Seleccione el tipo
									de usuario</option>
								<option value="Cliente">Cliente</option>
								<option value="Administrativo">Administrativo</option>
								<option value="Profesional">Profesional</option>
							</select>
						</div>

						<!-- Campos para Cliente -->
						<div id="camposCliente" class="d-none">
							<div class="mb-3">
								<label for="nombreEmpresa" class="form-label">Nombre de
									la Empresa:</label> <input type="text" class="form-control"
									id="nombreEmpresa" name="nombreEmpresa"
									placeholder="Ingrese el nombre de la empresa">
							</div>
							<div class="mb-3">
								<label for="direccion" class="form-label">Dirección:</label> <input
									type="text" class="form-control" id="direccion"
									name="direccion" placeholder="Ingrese la dirección">
							</div>
							<div class="mb-3">
								<label for="telefonoContacto" class="form-label">Teléfono
									de Contacto:</label> <input type="text" class="form-control"
									id="telefonoContacto" name="telefonoContacto"
									placeholder="Ingrese el teléfono de contacto">
							</div>
						</div>

						<!-- Campos para Administrativo -->
						<div id="camposAdministrativo" class="d-none">
							<div class="mb-3">
								<label for="areaResponsable" class="form-label">Área
									Responsable:</label> <input type="text" class="form-control"
									id="areaResponsable" name="areaResponsable"
									placeholder="Ingrese el área responsable">
							</div>
							<div class="mb-3">
								<label for="nivelAcceso" class="form-label">Nivel de
									Acceso:</label> <input type="text" class="form-control"
									id="nivelAcceso" name="nivelAcceso"
									placeholder="Ingrese el nivel de acceso">
							</div>
							<div class="mb-3">
								<label for="antiguedad" class="form-label">Antigüedad:</label> <input
									type="number" class="form-control" id="antiguedad"
									name="antiguedad" placeholder="Ingrese los años de antigüedad">
							</div>
							<div class="mb-3">
								<label for="numeroTareasAsignadas" class="form-label">Tareas
									Asignadas:</label> <input type="number" class="form-control"
									id="numeroTareasAsignadas" name="numeroTareasAsignadas"
									placeholder="Ingrese el número de tareas asignadas">
							</div>
						</div>

						<!-- Campos para Profesional -->
						<div id="camposProfesional" class="d-none">
							<div class="mb-3">
								<label for="tituloProfesional" class="form-label">Título
									Profesional:</label> <input type="text" class="form-control"
									id="tituloProfesional" name="tituloProfesional"
									placeholder="Ingrese su título profesional">
							</div>
							<div class="mb-3">
								<label for="especialidad" class="form-label">Especialidad:</label>
								<input type="text" class="form-control" id="especialidad"
									name="especialidad" placeholder="Ingrese su especialidad">
							</div>
							<div class="mb-3">
								<label for="aniosExperiencia" class="form-label">Años de
									Experiencia:</label> <input type="number" class="form-control"
									id="aniosExperiencia" name="aniosExperiencia"
									placeholder="Ingrese sus años de experiencia">
							</div>
							<div class="mb-3">
								<label for="cantidadCapacitacionesImpartidas" class="form-label">Capacitaciones
									Impartidas:</label> <input type="number" class="form-control"
									id="cantidadCapacitacionesImpartidas"
									name="cantidadCapacitacionesImpartidas"
									placeholder="Ingrese el número de capacitaciones impartidas">
							</div>
						</div>

						<!-- Botón de envío -->
						<div class="text-center">
							<button type="submit" id="botonEnvio" class="btn btn-primary">Crear
								Usuario</button>
						</div>
					</form>

					<!-- Alerta  -->
					<div id="mensajeAlerta" class="mt-4 d-none">
						<div class="alert alert-success alert-dismissible fade show"
							role="alert">
							<strong>Listo!</strong> El usuario se ha creado de manera
							exitosa.
							<button type="button" class="btn-close" aria-label="Close"
								onclick="cierreAlerta()"></button>
						</div>
					</div>

					<!-- Botón para volver al inicio -->
					<div class="text-center mt-4">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-secondary">Volver al Inicio</a>
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
		function mostrarCampos() {
			var tipoUsuario = document.getElementById('tipoUsuario').value;

			// Ocultar todos los campos
			document.getElementById('camposCliente').classList.add('d-none');
			document.getElementById('camposAdministrativo').classList
					.add('d-none');
			document.getElementById('camposProfesional').classList
					.add('d-none');

			// Mostrar los campos según el tipo de usuario
			if (tipoUsuario === 'Cliente') {
				document.getElementById('camposCliente').classList
						.remove('d-none');
			} else if (tipoUsuario === 'Administrativo') {
				document.getElementById('camposAdministrativo').classList
						.remove('d-none');
			} else if (tipoUsuario === 'Profesional') {
				document.getElementById('camposProfesional').classList
						.remove('d-none');
			}
		}

		function cierreAlerta() {
			document.getElementById("mensajeAlerta").classList.add('d-none');
		}
	</script>
</body>
</html>
