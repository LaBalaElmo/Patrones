package ejercciosPrimerParcial.factoryMethod;

public class Cuaderno {
	private String tipo;
	private int numDeHojas;

	public Cuaderno(String tipo, int numDeJojas) {
		this.tipo = tipo;
		this.numDeHojas = numDeJojas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumDeJojas() {
		return numDeHojas;
	}

	public void setNumDeJojas(int numDeJojas) {
		this.numDeHojas = numDeJojas;
	}

	public void showInfo() {
		System.out.println("Tipo de cuaderno: " + tipo);
		System.out.println("Numero de hojas del cuaderno: " + numDeHojas);
	}

}
