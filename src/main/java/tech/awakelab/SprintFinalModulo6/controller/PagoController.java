package tech.awakelab.SprintFinalModulo6.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.SprintFinalModulo6.model.bean.Pago;
import tech.awakelab.SprintFinalModulo6.model.service.PagoService;

@Controller
@RequestMapping("/pagos")
public class PagoController {
    
    @Autowired
    private PagoService pagoService;

    // Método para mostrar la lista de pagos
    @GetMapping
    public ModelAndView mostrarPagos() {        
        List<Pago> pagos = pagoService.getAll();  // Obtén la lista de pagos del servicio
        return new ModelAndView("pagos", "listapagos", pagos); // "pagos" es el JSP para listar los pagos
    }
    
    // Método para mostrar el formulario de creación de un pago
    @GetMapping("/crear")
    public ModelAndView mostrarFormularioCrearPago() {
        Pago pago = new Pago(); // Un objeto vacío para vincular con el formulario
        return new ModelAndView("crearPagos", "pago", pago); // "crearPago" es el JSP del formulario de pago
    }

    // Método para procesar el formulario de creación de pago
    @PostMapping("/crear")
    public String create(@RequestParam("monto") double monto, 
    	     @RequestParam("fecha") Date fecha, 
    	     @RequestParam("rutCliente") String rutCliente, 
    	     @RequestParam("capacitacion") String capacitacion, 
    	     Model model) { 
    	 
    	         Pago nuevoPago = new Pago(monto, fecha, rutCliente, capacitacion); 
    	         pagoService.create(nuevoPago); 
    	  
    	         return "redirect:/pagos"; 
    	  
    	     }
}
