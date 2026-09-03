package Ejercicio_10;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Guerrero extends Personaje {
    private String arma;

    public Guerrero(String nombre, int nivel, int hp, int ataque, String arma) {
        super(nombre, nivel, hp, ataque);
        this.arma = arma;
    }

    @Override
    public void atacar(Personaje objetivo) {
        objetivo.recibirDanio(this.getAtaque());
        System.out.println(this.nombre + " ataca con su " + this.arma + " y causa " + this.getAtaque() + " de daño.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Arma: " + this.arma);
    }


}
