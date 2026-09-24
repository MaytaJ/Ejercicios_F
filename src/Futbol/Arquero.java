package Futbol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Arquero extends Futbolista {
    private int atajadas;
    private int golesRecibidos;

    public Arquero(String nombre, String apellido, int edad, int dorsal, String club, int atajadas, int golesRecibidos) {
        super(nombre, apellido, edad, dorsal, club);
        this.atajadas = atajadas;
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public String getPuesto() {
        return "Arquero";
    }

    @Override
    public String jugarLaPelota() {
        return "Ataja con las manos y saca largo desde el arco";
    }

    @Override
    public double calcularRendimiento() {
        double nota = 5.0 + (atajadas * 1.5) - (golesRecibidos * 2.0);
        if (nota < 0) return 0.0;
        if (nota > 10) return 10.0;
        return nota;
    }
}