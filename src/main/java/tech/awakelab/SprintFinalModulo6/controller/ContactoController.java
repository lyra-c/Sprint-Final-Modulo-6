package tech.awakelab.SprintFinalModulo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class ContactoController {

    @GetMapping("/contacto")
    public String mostrarContacto() {
        return "contacto";	// Nombre de la vista JSP
    }
    
    
    @PostMapping("/contacto")
    public void enviarContacto(@RequestParam("nombre") String nombre,
    		@RequestParam("email") String email,
    		@RequestParam("mensaje") String mensaje) {
    	
    	System.out.println("Formulario de contacto recibido");
    	System.out.println("Nombre de contacto: " + nombre);
    	System.out.println("Email de contacto: " + email);
    	System.out.println("Nombre de mensaje: " + mensaje);
    }
}
