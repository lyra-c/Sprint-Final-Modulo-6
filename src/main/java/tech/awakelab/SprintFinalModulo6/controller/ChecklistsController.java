package tech.awakelab.SprintFinalModulo6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tech.awakelab.SprintFinalModulo6.model.bean.Checklist;
import tech.awakelab.SprintFinalModulo6.model.service.ChecklistService;

@Controller
@RequestMapping("/checklist")
public class ChecklistsController {
	
	// Inyecta el DAO con @Autowired
    @Autowired
    private ChecklistService checklistService;
    
    @GetMapping("/crearChecklist")
    public String mostrarChecklist() {
        return "checklist"; // Nombre de la vista JSP
    }
    
    // Crear un nuevo checklist
    @PostMapping("/crearChecklist")
    public String create(
    		@RequestParam("visitaId") int visitaId,
    		@RequestParam("detalle") String detalle, 
    		@RequestParam("estado") String estado,
    		Model model) {
    	
    	// Como se definió en el modelo Checklist, se puede emplear un constructor sin el parámetro para el "id"
        Checklist nuevoChecklist = new Checklist(visitaId, detalle, estado);
        checklistService.create(nuevoChecklist);
        return "redirect:/checklist/listarChecklist";
    }
      
    // Listar todos los checklists
    @GetMapping("/listarChecklist")
    public String listarChecklist(Model model) {
        List<Checklist> listachecklist = checklistService.getAll();
        model.addAttribute("checklist", listachecklist);
        return "listarChecklist"; // Nombre de la vista JSP
    }

    
    // Actualizar el estado de un checklist
    @PostMapping("/actualizarEstado")
    public String update(@RequestParam("id") int id, 
                                            @RequestParam("estado") String estado) {
        checklistService.update(id, estado);
        return "redirect:/checklist/listar";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarChecklist(@PathVariable("id") int id) {
        checklistService.delete(id);
        return "redirect:/checklist/listarChecklist"; // Redirige a la lista después de eliminar
    }
}