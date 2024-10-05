package tech.awakelab.SprintFinalModulo6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tech.awakelab.SprintFinalModulo6.model.bean.Administrativo;
import tech.awakelab.SprintFinalModulo6.model.bean.Cliente;
import tech.awakelab.SprintFinalModulo6.model.bean.CrearUsuario;
import tech.awakelab.SprintFinalModulo6.model.bean.Profesional;
import tech.awakelab.SprintFinalModulo6.model.service.CrearUsuarioService;

@Controller
@RequestMapping("/usuarios") // ruta de usuarios
public class CrearUsuarioController {

    @Autowired
    private CrearUsuarioService cs; // Inyecta el servicio de CrearUsuario

    @GetMapping("/crear")
    public String mostrarFormularioCreacion() {
        return "crearUsuarios"; // Retorna la vista JSP para la creación de usuarios
    }

    @PostMapping("/crear")
    public String create(
            @RequestParam("id") int id,

        @RequestParam("tipoUsuario") String tipoUsuario,
        @RequestParam("nombre") String nombre,
        @RequestParam("passwordUsuario") String passwordUsuario,
        @RequestParam("rutUsuario") String rutUsuario,
        @RequestParam("fechaNacimiento") String fechaNacimiento,
        @RequestParam("sexo") String sexo,
        @RequestParam(value = "nombreEmpresa", required = false) String nombreEmpresa,
        @RequestParam(value = "direccion", required = false) String direccion,
        @RequestParam(value = "telefonoContacto", required = false) String telefonoContacto,
        @RequestParam(value = "titulo", required = false) String titulo,
        @RequestParam(value = "fechaIngreso", required = false) String fechaIngreso,
        @RequestParam(value = "area", required = false) String area,
        @RequestParam(value = "experienciaPrevia", required = false) String experienciaPrevia,
        Model model) {

        CrearUsuario nuevoUsuario;

        // Crea una nueva instancia de CrearUsuario según el tipo proporcionado
        switch (tipoUsuario) {
            case "Cliente":
                nuevoUsuario = new Cliente(id, nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo,
                        nombreEmpresa, direccion, telefonoContacto);
                break;
            case "Profesional":
                nuevoUsuario = new Profesional(id, nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo,
                        titulo, fechaIngreso);
                break;
            case "Administrativo":
                nuevoUsuario = new Administrativo(id, nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo,
                        area, experienciaPrevia);
                break;
            default:
                model.addAttribute("error", "Tipo de usuario no válido.");
                return "crearUsuarios"; // Retorna a la vista si el tipo de usuario no es válido
        }

        cs.create(nuevoUsuario); // Llama al servicio para crear el usuario

        // Redirige al listado de usuarios después de la creación
        return "redirect:/usuarios/listarUsuario"; 
    }

    @GetMapping("/listarUsuario")
    public String listarUsuario(Model model) {
        List<CrearUsuario> listaUsuarios = cs.getAll(); 
        model.addAttribute("usuarios", listaUsuarios); // Pasa la lista al modelo
        return "listarUsuarios"; // Nombre de la vista JSP
    }

}
