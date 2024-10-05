package tech.awakelab.SprintFinalModulo6.model.bean;

public class Capacitacion {
    private int identificador;	// id generado automáticamente por la base de datos
    private String nombre;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int asistentes;

    // Constructor con "identificador"
    public Capacitacion(int identificador, String nombre, String rutCliente, String dia, String hora, String lugar, int duracion, int asistentes) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.asistentes = asistentes;
    }
    
 // Constructor sin "identificador" para crear nuevas capacitaciones debido al CRUD del sitio (sin id al inicio)
    public Capacitacion(String nombre, String rutCliente, String dia, String hora, String lugar, int duracion, int asistentes) {
        this.nombre = nombre;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.asistentes = asistentes;
    }
    
    // Constructor sin parámetros
    public Capacitacion() {
    	super();
    }

    // Getters y Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(int asistentes) {
        this.asistentes = asistentes;
    }
}

	