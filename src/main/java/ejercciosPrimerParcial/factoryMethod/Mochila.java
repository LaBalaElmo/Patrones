package ejercciosPrimerParcial.factoryMethod;

public class Mochila {
	private int numBolsillos;
	private String tamaño;

	public Mochila(int numBolsillos, String tamaño) {
		this.numBolsillos = numBolsillos;
		this.tamaño = tamaño;
	}

	public int getNumBolsillos() {
		return numBolsillos;
	}

	public void setNumBolsillos(int numBolsillos) {
		this.numBolsillos = numBolsillos;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public void showInfo() {
		System.out.println("Numero de bolsillos de la mochila: " + numBolsillos);
		System.out.println("Tamaño de la mochila: " + tamaño);
	}

}
