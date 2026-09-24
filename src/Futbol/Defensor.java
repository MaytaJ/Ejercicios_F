package Futbol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Defensor extends Futbolista {
    private int quites;
    private int despejes;

    public Defensor(String nombre, String apellido, int edad, int dorsal, String club, int quites, int despejes) {
        super(nombre, apellido, edad, dorsal, club);
        this.quites = quites;
        this.despejes = despejes;
    }

    @Override
    public String getPuesto() {
        return "Defensor";
    }

    @Override
    public String jugarLaPelota() {
        return "es el que defiende a muerte la porteria para que no metan goles";
    }

    @Override
    public double calcularRendimiento() {
        double nota = (quites * 1.2) + (despejes * 0.8);
        if (nota > 10) return 10.0;
        return nota;
    }
}