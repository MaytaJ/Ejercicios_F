import java.util.ArrayList;
import interfaces.Comentable;
import interfaces.Reportable;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post(1, "Mi primer posteo");
        Story story1 = new Story(1, "Foto del día");
        Cuenta cuenta1 = new Cuenta("juanp", "Juan Pérez");
        Pagina pagina1 = new Pagina("fatimatec", "Fátima Tecnología");

        post1.comentar("moni", "buenisimo");
        cuenta1.comentar("moni", "que grande juan");
        pagina1.comentar("moni", "excelente pagina");

        post1.reportar("contenido inapropiado");
        story1.reportar("contenido inapropiado");
        cuenta1.reportar("spam");
        pagina1.reportar("spam");

        ArrayList<Reportable> listaDenuncias = new ArrayList<>();
        listaDenuncias.add(post1);
        listaDenuncias.add(story1);
        listaDenuncias.add(cuenta1);
        listaDenuncias.add(pagina1);

        for (Reportable elemento : listaDenuncias) {
            elemento.reportar("contenido inapropiado");
        }
        ArrayList<Comentable> listaComentables = new ArrayList<>();
        listaComentables.add(post1);
        listaComentables.add(cuenta1);
        listaComentables.add(pagina1);
    }
}