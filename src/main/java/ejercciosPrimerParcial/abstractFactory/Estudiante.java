package ejercciosPrimerParcial.abstractFactory;

public class Estudiante {
	private String nombre;
	private String apellido;

	public Estudiante(String nombre, String apellio) {
		this.nombre = nombre;
		this.apellido = apellio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellio() {
		return apellido;
	}

	public void setApellio(String apellio) {
		this.apellido = apellio;
	}

	public void inscribirse(String materia) {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		FactoryMateria.make(materia).inscribirse();
	}

}
