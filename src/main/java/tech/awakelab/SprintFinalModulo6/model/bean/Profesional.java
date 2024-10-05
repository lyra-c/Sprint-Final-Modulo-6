package tech.awakelab.SprintFinalModulo6.model.bean;

public class Profesional extends CrearUsuario {
	private String titulo;
	private String fechaIngreso;

	public Profesional(int id, String nombre, String passwordUsuario, String rutUsuario, String fechaNacimiento,
			String sexo, String titulo, String fechaIngreso) {
		super(id, nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo, "Profesional");
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
}
