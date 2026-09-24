package Futbol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Delantero extends Futbolista {
    private int goles;
    private int remates;

    public Delantero(String nombre, String apellido, int edad, int dorsal, String club, int goles, int remates) {
        super(nombre, apellido, edad, dorsal, club);
        this.goles = goles;
        this.remates = remates;
    }

    @Override
    public String getPuesto() {
        return "Delantero";
    }

    @Override
    public String jugarLaPelota() {
        return "Olfato de goleador, es el que mete los goles en el partido";
    }

    @Override
    public double calcularRendimiento() {
        if (remates == 0) {
            return 0.0;
        }
        double efectividad = ((double) goles / remates) * 10.0;
        if (efectividad > 10.0) return 10.0;
        return efectividad;
    }
}