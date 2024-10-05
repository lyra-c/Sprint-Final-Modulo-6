package tech.awakelab.SprintFinalModulo6.model.bean;

public class Checklist {
    
    private int id;
    private int visitaId; // Cambiado a camelCase
    private String detalle;
    private String estado; // Usaremos String para representar el estado 'Pendiente' o 'Completado'

    // Constructores
    public Checklist() {}

    public Checklist(int visitaId, String detalle, String estado) {
        this.visitaId = visitaId;
        this.detalle = detalle;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVisitaId() { // Cambiado el getter a camelCase
        return visitaId;
    }

    public void setVisitaId(int visitaId) { // Cambiado el setter a camelCase
        this.visitaId = visitaId;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
