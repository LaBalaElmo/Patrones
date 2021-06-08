package chainOfResponsability.ejercicio.ejercicio2;

public class AlgoritmoHandler implements IAlgoritmo {
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
		Algoritmo1 a1 = new Algoritmo1();
		this.setNext(a1);

		Algoritmo2 a2 = new Algoritmo2();
		a1.setNext(a2);

		Algoritmo3 a3 = new Algoritmo3();
		a2.setNext(a3);

		this.next.revisarAlgoritmo(personas);

	}
}