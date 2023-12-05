public class Cliente {
    private int identificador;
    private String nombre;
    private String direccion;
    
    public Cliente(int identificador, String nombre, String direccion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    // Métodos Get y Set para el identificador, nombre y dirección
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
