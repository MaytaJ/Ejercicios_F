package Futbol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mediocampista extends Futbolista {
    private int pasesCompletados;
    private int asistencias;

    public Mediocampista(String nombre, String apellido, int edad, int dorsal, String club, int pasesCompletados, int asistencias) {
        super(nombre, apellido, edad, dorsal, club);
        this.pasesCompletados = pasesCompletados;
        this.asistencias = asistencias;
    }

    @Override
    public String getPuesto() {
        return "Mediocampista";
    }

    @Override
    public String jugarLaPelota() {
        return "Hace asistenicas y da asistenia a los delanteros para meter goles";
    }

    @Override
    public double calcularRendimiento() {
        double nota = (pasesCompletados * 0.1) + (asistencias * 2.0);
        if (nota > 10) return 10.0;
        return nota;
    }
}