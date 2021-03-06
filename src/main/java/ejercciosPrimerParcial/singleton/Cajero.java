package ejercciosPrimerParcial.singleton;

public class Cajero {
	private String nombre;

	public Cajero(String nombre) {
		this.nombre = nombre;
		System.out.println("Nombre de cajero: " + nombre);
	}

	public void ingresarContraseņa(String contraseņa) {
		VentanillaDePago.getInstance(contraseņa);
		System.out.println("La ventanilla esta a cargo de: " + nombre);
	}

	public int getMonto() {
		return VentanillaDePago.getInstance().getMonto();
	}

	public void cobrar(int monto) {
		VentanillaDePago.cobrar(monto);
	}
}
