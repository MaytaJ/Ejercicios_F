package Ejercicio_10;
import lombok.Getter;
import lombok.Setter;

@lombok.AllArgsConstructor
@lombok.NoArgsConstructor

@Getter
@Setter


public abstract class Personaje {
    protected String nombre;
    private int nivel;
    private int hp;
    private int ataque;

    public void recibirDanio(int cantidad) {
        this.hp -= cantidad;
        if (this.hp <= 0) {
            this.hp = 0;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Nivel: " + nivel + " | HP: " + hp + " | Ataque: " + ataque);
    }

    public abstract void atacar(Personaje personaje);


}
