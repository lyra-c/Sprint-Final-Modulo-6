package tech.awakelab.SprintFinalModulo6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tech.awakelab.SprintFinalModulo6.model.bean.Usuario;
import tech.awakelab.SprintFinalModulo6.model.dao.IUsuarioDao;
import tech.awakelab.SprintFinalModulo6.model.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")	// No hay vista para usuarios, esta "raíz" mapea ruta
public class UsuariosController {
	
	// Inyecta el DAO con @Autowired
    @Autowired
    UsuarioService us;
    
    @GetMapping("/listar")
    public String listarUsuarios(Model model) {
    	List<Usuario> listaUsuarios = us.getAll();
    	model.addAttribute("usuarios", listaUsuarios);
    	return "listarUsuarios";	// Nombre de la vista JSP
    }
	
}
