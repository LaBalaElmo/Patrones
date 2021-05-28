package factoryMethod.ejercicios;

public class Pasajero {
	private String nombre;
	private int CI;

	public Pasajero() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	public void showInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Cedula de identidad: " + CI);
	}
}
