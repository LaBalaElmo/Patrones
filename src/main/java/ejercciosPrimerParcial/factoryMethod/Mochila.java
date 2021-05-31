package ejercciosPrimerParcial.factoryMethod;

public class Mochila {
	private int numBolsillos;
	private String tama�o;

	public Mochila(int numBolsillos, String tama�o) {
		this.numBolsillos = numBolsillos;
		this.tama�o = tama�o;
	}

	public int getNumBolsillos() {
		return numBolsillos;
	}

	public void setNumBolsillos(int numBolsillos) {
		this.numBolsillos = numBolsillos;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public void showInfo() {
		System.out.println("Numero de bolsillos de la mochila: " + numBolsillos);
		System.out.println("Tama�o de la mochila: " + tama�o);
	}

}
