package tech.awakelab.SprintFinalModulo6.model.bean;

public class Cliente extends CrearUsuario {
	private String nombreEmpresa;
	private String direccion;
	private String telefonoContacto;

	public Cliente(int id, String nombre, String passwordUsuario, String rutUsuario, String fechaNacimiento,
			String sexo, String nombreEmpresa, String direccion, String telefonoContacto) {
		super(id, nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo, "Cliente");
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = direccion;
		this.telefonoContacto = telefonoContacto;
	}

	// Getters y Setters
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
}
