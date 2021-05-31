package ejercciosPrimerParcial.abstractFactory;

public class Client {
	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Jorge", "Quiroga");
		Estudiante estudiante2 = new Estudiante("Pedro", "Fernandez");
		Estudiante estudiante3 = new Estudiante("Juan", "Perez");
		Estudiante estudiante4 = new Estudiante("Carlos", "Lopez");
		Estudiante estudiante5 = new Estudiante("Roberto", "Landaeta");
		estudiante1.inscribirse("MATEMATICA");
		estudiante2.inscribirse("HISTORIA");
		estudiante3.inscribirse("INGLES");
		estudiante4.inscribirse("LENGUAJE");
		estudiante5.inscribirse("MATEMATICA");
	}
}
