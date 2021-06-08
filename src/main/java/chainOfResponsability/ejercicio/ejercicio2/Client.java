package chainOfResponsability.ejercicio.ejercicio2;

public class Client {
	public static void main(String[] args) {
		Persona[] personas = new Persona[19];
		for (int i = 0; i < 19; i++) {
			personas[i] = new Persona(789456+i, "juan" + i, (int)(Math.random()*40+1));
		}
		AlgoritmoHandler algoritmo = new AlgoritmoHandler();
		
		algoritmo.revisarAlgoritmo(personas);
		
		personas = new Persona[40];
		for (int i = 0; i < 40; i++) {
			personas[i] = new Persona(789456+i, "juan" + i, (int)(Math.random()*40+1));
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		algoritmo.revisarAlgoritmo(personas);
		
		personas = new Persona[60];
		for (int i = 0; i < 60; i++) {
			personas[i] = new Persona(789456+i, "juan" + i, (int)(Math.random()*40+1));
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		algoritmo.revisarAlgoritmo(personas);
	}
}
