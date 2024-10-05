package tech.awakelab.SprintFinalModulo6.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tech.awakelab.SprintFinalModulo6.model.*;
import tech.awakelab.SprintFinalModulo6.model.bean.Visita;
import tech.awakelab.SprintFinalModulo6.model.service.*;

@Controller
@RequestMapping("/visita")	// No hay vista para capacitaciones, esta "raíz" mapea ruta
public class VisitasController {

	
	// Inyecta el DAO con @Autowired
    @Autowired
//    private IVisitaDao visitaDao;
    private VisitaService visitaservice;

    @GetMapping("/crearVisita")
    public String mostrarVisita() {
        return "visita"; // Nombre de la vista JSP
    }

    @PostMapping("/crearVisita")
    public String create(
    	@RequestParam("cliente_id") int cliente_id,
	    @RequestParam("fecha_visita") String fecha_visita,
	    @RequestParam("detalle") String detalle,
	    @RequestParam("profesional_id") String profesional_id,
	    Model model) {

    		// Como se definió en el modelo Visita, se puede emplear un constructor sin el parámetro para el "id"
	        Visita nuevaVisita = new Visita(cliente_id, fecha_visita, detalle, profesional_id);
	        visitaservice.create(nuevaVisita);
	
	        return "redirect:/visita/listarVisitas";
	
	    }

    @GetMapping("/listarVisitas")
    public String listarVisitas(Model model) {
        List<Visita> listaVisitas = visitaservice.getAll();
        model.addAttribute("visita", listaVisitas);
        return "listarVisitas"; // Nombre de la vista JSP
    }
}