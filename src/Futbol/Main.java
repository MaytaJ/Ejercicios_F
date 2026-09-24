package Futbol;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Futbolista> equipo = new ArrayList<>();

        equipo.add(new Arquero("Emiliano", "Martínez", 31, 23, "Aston Villa", 6, 1));
        equipo.add(new Defensor("Cristian", "Romero", 25, 13, "Tottenham", 5, 4));
        equipo.add(new Defensor("Nicolas", "Otamendi", 36, 19, "Benfica", 3, 6));
        equipo.add(new Mediocampista("Rodrigo", "De Paul", 29, 7, "Atlético Madrid", 50, 2));
        equipo.add(new Delantero("Lionel", "Messi", 36, 10, "Inter Miami", 2, 3));

        System.out.println("           ----Resumen del equopo---      ");


        for (Futbolista f : equipo) {
            System.out.println(f.resumenPartido());
        }

        Futbolista elMejor = equipo.get(0);
        for (Futbolista f : equipo) {
            if (f.calcularRendimiento() > elMejor.calcularRendimiento()) {
                elMejor = f;
            }
        }

        System.out.println("              MVPS del partido                ");
        System.out.println(elMejor.resumenPartido());

        int cantArqueros = 0;
        int cantDefensores = 0;
        int cantMediocampistas = 0;
        int cantDelanteros = 0;

        for (Futbolista f : equipo) {
            if (f instanceof Arquero) {
                cantArqueros++;
            } else if (f instanceof Defensor) {
                cantDefensores++;
            } else if (f instanceof Mediocampista) {
                cantMediocampistas++;
            } else if (f instanceof Delantero) {
                cantDelanteros++;
            }
        }

        System.out.println("          Jugadores que hay en su posicion          ");
        System.out.println("Arqueros: " + cantArqueros);
        System.out.println("Defensores: " + cantDefensores);
        System.out.println("Mediocampistas: " + cantMediocampistas);
        System.out.println("Delanteros: " + cantDelanteros);
    }
}