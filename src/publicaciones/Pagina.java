package publicaciones;

import interfaces.Comentable;
import interfaces.Reportable;
import usuarios.Usuario;

public class Pagina extends Usuario implements Comentable, Reportable {

    public Pagina(String arroba, String nombre) {
        super(arroba, nombre);
    }

    @Override
    public void comentar(String autor, String texto) {
        System.out.println("[COMENT EN PAGINA @" + getArroba() + "] " + autor + ": \"" + texto + "\"");
    }

    @Override
    public void reportar(String motivo) {
        System.out.println("Reporte recibido en @" + getArroba() + ": motivo = " + motivo);
    }
}