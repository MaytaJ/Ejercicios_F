package actividad_8;

public class Personajes {
protected String nombre;
private int nivel; 
private int hp;
private int ataque;
public Personajes() {
}
public Personajes(String nombre, int nivel, int hp, int ataque) {
	this.nombre = nombre;
	this.nivel = nivel;
	this.hp = hp;
	this.ataque = ataque;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getNivel() {
	return nivel;
}
public void setNivel(int nivel) {
	this.nivel = nivel;
}
public int getHp() {
	return hp;
}
public void setHp(int hp) {
	this.hp = hp;
}
public int getAtaque() {
	return ataque;
}
public void setAtaque(int ataque) {
	this.ataque = ataque;
}
public String mostrarInfo () {
	return "Personajes [nombre=" + nombre + ", nivel=" + nivel + ", hp=" + hp + ", ataque=" + ataque + "]";
}

public void subirNivel() {
	this.nivel += 1;
	this.hp += 10;
	this.ataque += 5;
}
public void recibirDanio(int cantidad) {
	this.hp -= cantidad;
	if (this.hp < 0) {
		this.hp = 0;
	}
}

public boolean estaVivo() {
    if (this.hp > 0) {
        return true;  
    } else {
        return false; 
    }
}
protected int getataque() {
	return ataque;
}



}
