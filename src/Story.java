import interfaces.Reportable;

public class Story extends Publicacion implements Reportable {

    public Story(int id, String contenido) {
        super(id, contenido);
    }

    @Override
    public void reportar(String motivo) {
        System.out.println("Reporte recibido en STORY #" + getId() + ": motivo = " + motivo);
    }
}