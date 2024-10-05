package tech.awakelab.SprintFinalModulo6.model.bean;

public class CrearUsuario {
	private int id;
	private String nombre;
	private String passwordUsuario;
	private String rutUsuario;
	private String fechaNacimiento;
	private String sexo;
	private String tipoUsuario;

	public CrearUsuario(int id, String nombre, String passwordUsuario, String rutUsuario, String fechaNacimiento,
			String sexo, String tipoUsuario) {
		this.id = id;
		this.nombre = nombre;
		this.passwordUsuario = passwordUsuario;
		this.rutUsuario = rutUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.tipoUsuario = tipoUsuario;
	}

	public CrearUsuario(String nombre, String passwordUsuario, String rutUsuario, String fechaNacimiento,
			String sexo, String tipoUsuario) {
		this.nombre = nombre;
		this.passwordUsuario = passwordUsuario;
		this.rutUsuario = rutUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.tipoUsuario = tipoUsuario;
	}
	public CrearUsuario() {
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

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
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

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
