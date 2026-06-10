package actividades_7;

public class Manga extends Libro {
    private int numeroTomo;
    private String ilustrador;

    public Manga(String titulo, String autor, int ejemplares, int prestados, int numeroTomo, String ilustrador) {
        super(titulo, autor, ejemplares, prestados); 
        this.numeroTomo = numeroTomo;
        this.ilustrador = ilustrador;
    }

    public Manga(int numeroTomo, String ilustrador) {
		this.numeroTomo = numeroTomo;
		this.ilustrador = ilustrador;
	}
	public int getNumeroTomo() {
		return numeroTomo;
	}

	public void setNumeroTomo(int numeroTomo) {
		this.numeroTomo = numeroTomo;
	}

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

	public String toString() {
        return super.toString() + " | Manga [Tomo=" + numeroTomo + ", Ilustrador=" + ilustrador + "]";
    }
}

