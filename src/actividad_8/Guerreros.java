package actividad_8;

public class Guerreros extends Personajes{
	private String arma;

	public Guerreros(String nombre, int nivel, int hp, int ataque) {
		super(nombre, nivel, hp, ataque);
	}

	public Guerreros(String nombre, int nivel, int hp, int ataque, String arma) {
		super(nombre, nivel, hp, ataque);
		this.arma = arma;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public void atacar(Personajes objetivo) {
		int danio = this.getataque();
		System.out.println(this.nombre + " ataca a " + objetivo.getNombre() + " con su " + this.arma + " causando " + danio+ " de dañooo");
		objetivo.recibirDanio(danio);
	}

	
	public String mostrarInfo() {
		return super.mostrarInfo() + " [Arma=" + arma + "]";
	}

	

	
	
	
	

	
	
	
}
