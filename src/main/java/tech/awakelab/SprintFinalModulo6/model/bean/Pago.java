package tech.awakelab.SprintFinalModulo6.model.bean;

import java.sql.Date;

//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;


public class Pago {
	
	private int id;
	
//	@Min(value = 1, message = "El monto debe ser mayor o igual a 1")
	private double monto;
	
//	@NotNull(message = "La fecha no puede ser nula")
	private Date fecha;
	
	private String rutCliente;
	private String capacitacion;
	
	public Pago() {
		super();		
	}
	
	public Pago(int id, double monto, Date fecha, String rutCliente, String capacitacion ) {
		super();
		this.id = id;
		this.monto = monto;
		this.fecha = fecha;
		this.setRutCliente(rutCliente);
		this.capacitacion= capacitacion;
	}
	
	public Pago( double monto, Date fecha, String rutCliente, String capacitacion ) {
		super();
		this.monto = monto;
		this.fecha = fecha;
		this.setRutCliente(rutCliente);
		this.capacitacion= capacitacion;
	}

	// Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCapacitacion() {
		return capacitacion;
	}

	public void setCapacitacion(String capacitacion) {
		this.capacitacion = capacitacion;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
}
