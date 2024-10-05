package tech.awakelab.SprintFinalModulo6.model.bean;


public class Usuario {

	// Atributos
	private int id;
	private String nombre;
	private String tipo; // Para pasar a ENUM posteriormente
	private String rutUsuario;
	private String fechaNacimiento; // Antes usaba LocalDate en vez de String
	private String sexo;
	private String direccion;

	// Constructor sin parámetros
	public Usuario() {
	}

	// Constructor con parámetros
	public Usuario(int id, String nombre, String tipo, String rutusuario, String fechaNacimiento, String sexo,
			String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.rutUsuario = rutusuario;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.direccion = direccion;
	}
	

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRutUsuario() {
		return rutUsuario;
	}

	public void setRutUsuario(String rutUsuario) {
		this.rutUsuario = rutUsuario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/* *
	 * Código previo que usaba ENUM
	 * ENUM para representar los posibles valores del tipo de usuario
	 * El uso de jdbc con beans y RowMapper no permite emplear los tipos de dato 
	 * LocalDate y TipoUsuario, por lo que fueron dejados como String
	 * 
	 * public enum TipoUsuario {
	 * 		CLIENTE, ADMINISTRATIVO, PROFESIONAL
	 * 	} 
	 * */
}