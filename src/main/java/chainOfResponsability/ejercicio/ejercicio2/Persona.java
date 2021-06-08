package chainOfResponsability.ejercicio.ejercicio2;

public class Persona implements Comparable<Persona> {
	private int ci;
	private String nombre;
	private int edad;

	public Persona(int ci, String nombre, int edad) {
		this.ci = ci;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona o) {
		if (this.edad < o.edad) {
			return -1;
		}
		if (this.edad > o.edad) {
			return 1;
		}
		return 0;
	}

	public void info() {
		System.out.println("**********************************");
		System.out.println("Cedula de indentidad: " + ci);
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}

}
