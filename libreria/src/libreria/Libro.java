package libreria;

public class Libro {
	
	private String libro, autor;
	private int numEjemplar, numPrestados;
	
	
	
	public Libro(String libro, String autor, int numEjemplar, int numPrestados) {
		this.libro = libro;
		this.autor = autor;
		this.numEjemplar = numEjemplar;
		this.numPrestados = numPrestados;
	}

	public Libro() {
	}



	public String getLibro() {
		return libro;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getNumEjemplar() {
		return numEjemplar;
	}
	
	public int getNumPrestados() {
		return numPrestados;
	}
	
	public void setLibro(String libro) {
		this.libro = libro;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setNumEjemplar(int numEjemplar) {
		this.numEjemplar = numEjemplar;
	}
	
	public void setNumPrestados(int numPrestados) {
		this.numPrestados = numPrestados;
	}
	
	public boolean prestamo() {
		if(numEjemplar == 0) {
			return false;
		} else {
			numEjemplar--;
			numPrestados++;
			return true;
			
		}
	}
	
	public boolean devolucion() {
		if(numPrestados != 0) {
			numPrestados--;
			numEjemplar++;
			return true;
		} else {
			return false;
			
		}
	}

	@Override
	public String toString() {
		return "Libro [libro=" + libro + ", autor=" + autor + ", numEjemplar=" + numEjemplar + ", numPrestados="
				+ numPrestados + "]";
	}
	
	
	
}
