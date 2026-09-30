public abstract class Usuario {
    private String arroba;
    private String nombre;

    public Usuario(String arroba, String nombre) {
        this.arroba = arroba;
        this.nombre = nombre;
    }

    public String getArroba() {
        return arroba;
    }

    public void setArroba(String arroba) {
        this.arroba = arroba;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}