package strategy.ejercicio;

public class Ropa {
	private String tipo;
	private double precio;

	public Ropa(String tipo, int precio) {
		this.tipo = tipo;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double d) {
		this.precio = d;
	}

}
