package tech.awakelab.SprintFinalModulo6.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    // Constantes
    // -----------------------------------------------------------------------------------------

    /** Objeto {@link Logger} que contiene los métodos de depuración */
    private static final Logger logger = LogManager.getLogger(HomeController.class);

    // Solicitudes GET
    // -----------------------------------------------------------------------------------------

    /**
     * Muestra la Página de Inicio
     *
     * @param request objeto {@link HttpServletRequest} que contiene la información
     *                de la solicitud que le hace el cliente al {@link HttpServlet}
     * @param modelo  objeto {@link Model} con el modelo de la vista
     *
     * @return un objeto {@link String} con la respuesta a la solicitud
     */
    @RequestMapping(path = { "/", "/{nombre}" }, method=RequestMethod.GET) 
    	public ModelAndView mostrarInicio() {
    		return new ModelAndView("inicio");
    }
    
    @RequestMapping(value="/login")
    public ModelAndView login() {
    	return new ModelAndView("login");
    }
    
    @RequestMapping(value="/error")
    public ModelAndView errorLogin() {
    	return new ModelAndView("login", "error", "true");
    }
    
    @RequestMapping(value="/logout")
    public ModelAndView logout() {
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    	if (auth != null) {
    		SecurityContextHolder.getContext().setAuthentication(null);
    	}
    	return new ModelAndView("redirect:/login?logout");
    }
    
}