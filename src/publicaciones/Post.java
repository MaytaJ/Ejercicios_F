package publicaciones;

import interfaces.Comentable;
import interfaces.Reportable;

public class Post extends Publicacion implements Comentable, Reportable {

    public Post(int id, String contenido) {
        super(id, contenido);
    }

    @Override
    public void comentar(String autor, String texto) {
        System.out.println("[COMENT EN POST #" + getId() + "] " + autor + ": \"" + texto + "\"");
    }

    @Override
    public void reportar(String motivo) {
        System.out.println("Reporte recibido en POST #" + getId() + ": motivo = " + motivo);
    }
}