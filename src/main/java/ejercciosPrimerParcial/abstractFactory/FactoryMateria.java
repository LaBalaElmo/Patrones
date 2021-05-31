package ejercciosPrimerParcial.abstractFactory;

public class FactoryMateria {
	public static enum Materia {
		HISTORIA, INGLES, LENGUAJE, MATEMATICA
	}

	public static IMateria make(String materias) {
		IMateria materia;
		Materia typeMateria = Materia.valueOf(materias);

		switch (typeMateria) {
		case HISTORIA:
			materia = new Historia();
			break;
		case INGLES:
			materia = new Ingles();
			break;
		case LENGUAJE:
			materia = new Lenguaje();
			break;
		case MATEMATICA:
			materia = new Matematica();
			break;
		default:
			System.out.println("La materia seleccionada no esta disponible");
			materia = null;
			break;
		}

		return materia;
	}
}
