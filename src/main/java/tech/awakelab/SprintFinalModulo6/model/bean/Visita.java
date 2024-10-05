package tech.awakelab.SprintFinalModulo6.model.bean;

import java.sql.Date;

public class Visita{
    private int id;  //id generado automáticamente por la base de datos
    private int cliente_id;
    private String nombre;
    private String fecha_visita;
    private String detalle;
    private String profesional_id;
    
    
 // Constructor con "id"
    public Visita(int id, int cliente_id, String fecha_visita,String detalle, String profesional_id) {
    this.id = id;
    this.cliente_id = cliente_id;
    this.nombre = nombre;
    this.fecha_visita = fecha_visita;
    this.detalle = detalle;
    this.profesional_id = profesional_id;
    }
    
 // Constructor sin "id" para crear nuevos registros de visita  
    public Visita ( int cliente_id, String fecha_visita, String detalle, String profesional_id) {
    	this.cliente_id = cliente_id;
    	this.nombre = nombre;
        this.fecha_visita = fecha_visita;
        this.detalle = detalle;
        this.profesional_id = profesional_id;
       }
    
    // Constructor sin parámetros
    public Visita() {
    	super();
    }
    
    // Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	
	public String getFecha_visita() {
		return fecha_visita;
	}

	public void setFecha_visita(String fecha_visita) {
		this.fecha_visita = fecha_visita;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getProfesional_id() {
		return profesional_id;
	}

	public void setProfesional_id(String profesional_id) {
		this.profesional_id = profesional_id;
	}
    
}

	