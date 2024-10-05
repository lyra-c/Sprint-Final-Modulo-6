<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Integrantes: Diego Rivera - Beatriz Maldonado - Jorge Lira - Jorge Montoya - Felipe Martínez - Sammy Maldonado --->
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- CDN Bootstrap -->
<title>Contacto - Sistema de Información de Prevención de
	Riesgos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	
</head>
<body>
	<%@ include file='navbar.jsp'%>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-8 col-lg-6">
				<div class="bg-white p-4 rounded shadow-sm">
					<h1 class="text-center mb-4 display-5">Contacto</h1>
					<form id="contactoForm" action="contacto" method="post">
						<div class="mb-3">
							<label for="nombre" class="form-label">Nombre:</label> <input
								type="text" class="form-control" id="nombre" name="nombre"
								placeholder="Ingrese su nombre" required>
						</div>
						<div class="mb-3">
							<label for="email" class="form-label">Email:</label> <input
								type="email" class="form-control" id="email" name="email"
								placeholder="Ingrese su email" required>
						</div>
						<div class="mb-3">
							<label for="mensaje" class="form-label">Mensaje:</label>
							<textarea class="form-control" id="mensaje" name="mensaje"
								rows="5" placeholder="Ingrese el mensaje" required></textarea>
						</div>
						<div class="text-center">
							<button type="submit" id="botonEnvio" class="btn btn-primary" 
								>Enviar</button>
						</div>
					</form>
					<div id="mensajeAlerta" class="mt-4 d-none">
						<div class="alert alert-success alert-dismissible fade show"
							role="alert">
							<strong>¡Listo!</strong> El mensaje se ha enviado de manera
							exitosa.
							<button type="button" class="btn-close" aria-label="Close"
								onclick="cierreAlerta()"></button>
						</div>
					</div>
					<div class="text-center mt-4">
						<a href="./" class="btn btn-secondary">Volver al Inicio</a>
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
	
		// Código para pasar datos del formulario al back-end sin redireccionar la página
			// (permite desplegar el mensaje de alerta en el sitio una vez hecho el POST)
		// Código proveído por ChatGPT. Es uso del fetch de Javascript
		document.getElementById('contactoForm').addEventListener('submit', function(event) {
	    	event.preventDefault();  // Evita el redireccionamiento
	
	    	// Captura los valores del formulario
	    	const nombre = document.getElementById('nombre').value;
	    	const email = document.getElementById('email').value;
	    	const mensaje = document.getElementById('mensaje').value;
	
	    	// Realiza la solicitud POST usando fetch
	    	fetch('contacto', {
	    		method: 'POST',
	    		headers: {
	    			'Content-Type': 'application/x-www-form-urlencoded',
	    		},
	    		body: new URLSearchParams({
	    			nombre: nombre,
	    			email: email,
	    			mensaje: mensaje
	    		})
	    	})
	    	.then(response => {
	    		if (response.ok) {
	    			// Muestra el mensaje de éxito
	    			document.getElementById('mensajeAlerta').classList.remove('d-none');
	    			// Limpia el formulario
	    			document.getElementById('contactoForm').reset();
	    		} else {
	    			console.error('Error en la solicitud');
	    		}
	    	})
	    	.catch(error => console.error('Error:', error));
		});
		
		function cierreAlerta() {
			document.getElementById('mensajeAlerta').classList.add('d-none');
		}
	</script>
</body>
</html>
