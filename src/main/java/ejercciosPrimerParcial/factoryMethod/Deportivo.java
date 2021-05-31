package ejercciosPrimerParcial.factoryMethod;

public class Deportivo {
	private int talla;
	private String color;
	private int numPrendas;

	public Deportivo(int talla, String color, int numPrendas) {
		this.talla = talla;
		this.color = color;
		this.numPrendas = numPrendas;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPrendas() {
		return numPrendas;
	}

	public void setNumPrendas(int numPrendas) {
		this.numPrendas = numPrendas;
	}

	public void showInfo() {
		System.out.println("Talla del deportivo: " + talla);
		System.out.println("Color del deportivo: " + color);
		System.out.println("Numero de prendas del deportivo: " + numPrendas);
	}

}
