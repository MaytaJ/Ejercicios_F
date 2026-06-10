package actividades_7;

public class Libro {

	private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
	public Libro() {
	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	public Libro(Libro otroLibro) {
	    this.titulo = otroLibro.titulo;
	    this.autor = otroLibro.autor;
	    this.ejemplares = otroLibro.ejemplares;
	    this.prestados = otroLibro.prestados;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados="
				+ prestados + "]";
	}
    
	
	public boolean prestamo() {
        boolean prestado = true;
        if (this.prestados < this.ejemplares) {
            this.prestados++;
        } else {
            prestado = false;
        }
        return prestado;
    }

    public boolean devolucion() {
        boolean devuelto = true;
        if (this.prestados == 0) {
            devuelto = false;
        } else {
            this.prestados--;
        }
        return devuelto;
    }
	
	
	
	
	
	
}
