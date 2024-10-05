<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Pago - Gestión de Riesgos</title>
    <!-- Bootstrap 5.3.3 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="/res/css/estilo.css" type="text/css">	
</head>
<%@ include file='navbar.jsp'%>
<body>
    <div class="container mt-5">
        <h2 class="text-center mb-4">Agregar Pago por Servicio de Capacitación</h2>
        
        <div class="row justify-content-center">
            <div class="col-md-6">
                <!-- Formulario para agregar un pago -->
                <form action="${pageContext.request.contextPath}/pagos/crear" method="post" class="needs-validation" novalidate>
                    <div class="mb-3">
                        <label for="monto" class="form-label">Monto del Pago</label>
                        <input type="number" class="form-control" id="monto" name="monto" required min="1" placeholder="Ingrese el monto del pago">
                        <div class="invalid-feedback">
                            El monto es obligatorio y debe ser mayor o igual a 1.
                        </div>
                    </div>
                    
                    <div class="mb-3">
                        <label for="fecha" class="form-label">Fecha del Pago</label>
                        <input type="date" class="form-control" id="fecha" name="fecha" required>
                        <div class="invalid-feedback">
                            La fecha del pago es obligatoria.
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="rutCliente" class="form-label">RUT del Cliente</label>
                        <input type="text" class="form-control" id="rutCliente" name="rutCliente" required placeholder="Ingrese el RUT del cliente">
                        <div class="invalid-feedback">
                            El RUT del cliente es obligatorio.
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="capacitacion" class="form-label">Capacitación</label>
                        <input type="text" class="form-control" id="capacitacion" name="capacitacion" required placeholder="Descripción de la capacitación">
                        <div class="invalid-feedback">
                            La capacitación es obligatoria.
                        </div>
                    </div>

                    <div class="d-grid gap-2 mb-5">
                        <button type="submit" class="btn btn-primary">Agregar Pago</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <%@ include file="footer.jsp" %>

    <!-- Bootstrap JS Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

    <script>
        // Bootstrap form validation
        (function () {
            'use strict'
            var forms = document.querySelectorAll('.needs-validation')
            Array.prototype.slice.call(forms).forEach(function (form) {
                form.addEventListener('submit', function (event) {
                    if (!form.checkValidity()) {
                        event.preventDefault()
                        event.stopPropagation()
                    }
                    form.classList.add('was-validated')
                }, false)
            })
        })()
    </script>
</body>
</html>