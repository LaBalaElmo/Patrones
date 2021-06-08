package chainOfResponsability.ejercicio.ejercicio1;

public class Client1 {
	public static void main(String[] args) {
		ProcesoCarnetizacion proceso = new ProcesoCarnetizacion();
		
		proceso.revisarRequisitos(new Persona(true, true, true));
		System.out.println("**************************************");
		proceso.revisarRequisitos(new Persona(false, true, true));
		System.out.println("**************************************");
		proceso.revisarRequisitos(new Persona(true, false, true));
		System.out.println("**************************************");
		proceso.revisarRequisitos(new Persona(true, false, false));
	}
}
