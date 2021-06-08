package chainOfResponsability.ejercicio.ejercicio2;

import java.util.Arrays;

public class Algoritmo2 implements IAlgoritmo {
	private IAlgoritmo next;

	@Override
	public void setNext(IAlgoritmo handler) {
		this.next = handler;
	}

	@Override
	public IAlgoritmo next() {
		return this.next;
	}

	@Override
	public void revisarAlgoritmo(Persona[] personas) {
		if (personas.length < 51) {
			Arrays.sort(personas);
			System.out.println("Ordenando con el algoritmo 2");
			for (int i = 0; i < personas.length; i++) {
				personas[i].info();
			}
		} else {
			this.next.revisarAlgoritmo(personas);
		}

	}
}