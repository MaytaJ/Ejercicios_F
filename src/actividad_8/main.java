package actividad_8;

public class main {
    public static void main(String[] args) {
        
        Guerreros g1 = new Guerreros("Mario", 1, 100, 15, "Hacha");
        Guerreros g2 = new Guerreros("Milei", 1, 120, 12, "Espada");

        System.out.println(g1.mostrarInfo());
        System.out.println(g2.mostrarInfo());

        g1.atacar(g2);

        System.out.println(g2.mostrarInfo());

        g1.subirNivel();

        System.out.println(g1.mostrarInfo());
    }
}
