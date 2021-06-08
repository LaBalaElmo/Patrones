package chainOfResponsability.ejercicio.ejercicio2;

public interface IAlgoritmo {
	void setNext(IAlgoritmo handler);

	IAlgoritmo next();

	void revisarAlgoritmo(Persona[] personas);
}
