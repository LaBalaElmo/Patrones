package ejercciosPrimerParcial.singleton;

public class Estudiante {
	private String nombre;
	private int codigo;

	public Estudiante(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		showInfo();
	}

	public void pagar(Cajero cajero, int monto) {
		cajero.cobrar(monto);
		System.out.println("El estudiante " + nombre + " pago el monto de " + monto);
	}

	public void showInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Codigo: " + codigo);
	}

}
