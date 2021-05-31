package ejercciosPrimerParcial.abstractFactory;

public class Historia implements IMateria {
	private String nombre;
	private int duracion;

	public Historia() {
		nombre = "historia";
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
		System.out.println("La materia inscrita es: " + nombre  + " horas");
		System.out.println("La duracion del curso por clases es: " + duracion);
	}
}
