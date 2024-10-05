package tech.awakelab.SprintFinalModulo6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tech.awakelab.SprintFinalModulo6.model.bean.*;
import tech.awakelab.SprintFinalModulo6.model.dao.ICapacitacionDao;
import tech.awakelab.SprintFinalModulo6.model.service.CapacitacionService;


@Controller
@RequestMapping("/capacitaciones")	// No hay vista para capacitaciones, esta "raíz" mapea ruta
public class CapacitacionesController {

	
	// Inyecta el DAO con @Autowired
    @Autowired
//    private ICapacitacionDao capacitacionDao;
    private CapacitacionService cs;

    @GetMapping("/crear")
    public String mostrarCapacitaciones() {
        return "capacitaciones"; // Nombre de la vista JSP
    }

    @PostMapping("/crear")
    public String create(@RequestParam("nombre") String nombre,
	    @RequestParam("rutCliente") String rutCliente,
	    @RequestParam("dia") String dia,
	    @RequestParam("hora") String hora,
	    @RequestParam("lugar") String lugar,
	    @RequestParam("duracion") int duracion,
	    @RequestParam("asistentes") int asistentes,
	    Model model) {

    		// Como se definió en el modelo Capacitacion, se puede emplear un constructor sin el parámetro para el "id"
	        Capacitacion nuevaCapacitacion = new Capacitacion(nombre, rutCliente, dia, hora, lugar, duracion, asistentes);
	        cs.create(nuevaCapacitacion);
	
	        return "redirect:/capacitaciones/listar";
	
	    }

    @GetMapping("/listar")
    public String listarCapacitaciones(Model model) {
        List<Capacitacion> listaCapacitaciones = cs.getAll();
        model.addAttribute("capacitaciones", listaCapacitaciones);
        return "listarCapacitaciones"; // Nombre de la vista JSP
    }
}