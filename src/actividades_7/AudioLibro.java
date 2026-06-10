package actividades_7;
public final class AudioLibro extends Libro {
    private int duracionMin;
    private String narrador;

    public AudioLibro(String titulo, String autor, int ejemplares, int prestados, int duracionMin, String narrador) {
        super(titulo, autor, ejemplares, prestados);
        this.duracionMin = duracionMin;
        this.narrador = narrador;
    }

    public AudioLibro(AudioLibro otroAudio) {
        super(otroAudio);
        this.duracionMin = otroAudio.duracionMin;
        this.narrador = otroAudio.narrador;
    }
    
    public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}

	public String getNarrador() {
		return narrador;
	}

	public void setNarrador(String narrador) {
		this.narrador = narrador;
	}

	public String toString() {
		return "AudioLibro [duracionMin=" + duracionMin + ", narrador=" + narrador + "]";
	}

	
}

