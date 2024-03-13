package modelodeusuarios;

public class ModeloDeUsuarios {
    
    private String nombre;
    private String id;

    public ModeloDeUsuarios(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void limpiarAlEliminar() {
        this.nombre = null;
        this.id = null;
    }
}

