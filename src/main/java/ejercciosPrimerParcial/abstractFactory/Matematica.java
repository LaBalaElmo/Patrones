package ejercciosPrimerParcial.abstractFactory;

public class Matematica implements IMateria {
	private String nombre;
	private int duracion;

	public Matematica() {
		nombre = "Matematica";
		duracion = 2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public void inscribirse() {
		System.out.println("La materia inscrita es: " + nombre);
		System.out.println("La duracion del curso por clases es: " + duracion + " horas");
	}

}
