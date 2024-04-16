package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	public CalculadoraEspecial() {
		super();
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
	public long CalcularSumatoria() {
		long suma=0;
		for(int k=1;k<n+1;k++) {
			suma += (long) Math.pow(((k+1)*k)/2,2);
		}
		return suma;
	}
	
	public long CalcularProductoria() {
		long prod=1;
		for(int k=1;k<n+1;k++) {
			prod *= (long) (k+4)*k;
		}
		return prod;
	}
}
