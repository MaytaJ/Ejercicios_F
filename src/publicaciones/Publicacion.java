package publicaciones;

public abstract class Publicacion {
    private int id;
    private String contenido;

    public Publicacion(int id, String contenido) {
        this.id = id;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }
}