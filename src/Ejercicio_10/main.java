package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Personaje> equipo = new ArrayList<>();

        equipo.add(new Guerrero("Thorin", 5, 120, 25, "Hacha de Batalla"));
        equipo.add(new Guerrero("Legolas", 4, 100, 22, "Arco Élfico"));
        equipo.add(new Mago("Gandalf", 10, 80, 10, 40, 50));
        equipo.add(new Mago("Radagast", 8, 70, 10, 30, 5));

        Personaje objetivo = new Guerrero("Trolllllll", 1, 300, 0, "Ninguna");

        System.out.println("--- estado inicial ---");
        objetivo.mostrarInfo();
        System.out.println("\n--- iniciode los ataques ---");

        for (Personaje p : equipo) {
            p.atacar(objetivo);
        }

        System.out.println(" ---esta final  ---");
        objetivo.mostrarInfo();
    }
}