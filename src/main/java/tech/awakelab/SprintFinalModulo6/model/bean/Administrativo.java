package tech.awakelab.SprintFinalModulo6.model.bean;

public class Administrativo extends CrearUsuario {
	private String area;
	private String experienciaPrevia;

	public Administrativo(int id, String nombre, String passwordUsuario, String rutUsuario, String fechaNacimiento,
			String sexo, String area, String experienciaPrevia) {
		super(id, nombre, passwordUsuario, rutUsuario, fechaNacimiento, sexo, "Administrativo");
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	// Getters y Setters
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
}
