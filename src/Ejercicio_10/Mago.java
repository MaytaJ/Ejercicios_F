package Ejercicio_10;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mago extends Personaje {

    private static final int COSTO_MANA = 10;
    private int poderMagico;
    private int mana;

    public Mago(String nombre, int nivel, int hp, int ataque, int poderMagico, int mana) {
        super(nombre, nivel, hp, ataque);
        this.poderMagico = poderMagico;
        this.mana = mana;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (this.mana >= COSTO_MANA) {
            this.mana -= COSTO_MANA;
            System.out.println(this.nombre + " lanza un hechizo causando " + this.poderMagico + " de daño y el Mana restante es : " + this.mana);
            objetivo.recibirDanio(this.poderMagico);
        } else {
            System.out.println(this.nombre + " no tiene suficiente maná para atacar.");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Poder Mágico: " + this.poderMagico + " | Maná: " + this.mana);
    }
}