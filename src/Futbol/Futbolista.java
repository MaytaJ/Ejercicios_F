package Futbol;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Futbolista extends Persona {
    private int dorsal;
    private String club;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String club) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.club = club;
    }

    public abstract String getPuesto();
    public abstract String jugarLaPelota();
    public abstract double calcularRendimiento();

    public String resumenPartido() {
        return "[" + getPuesto() + "] " + getDorsal() + " " + getNombre() + " " + getApellido() +
                " (" + getClub() + ") | Acción: " + jugarLaPelota() +
                " | Rendimiento: " + calcularRendimiento() + "/10";
    }

}