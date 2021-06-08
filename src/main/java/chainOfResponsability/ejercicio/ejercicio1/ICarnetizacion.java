package chainOfResponsability.ejercicio.ejercicio1;

public interface ICarnetizacion {
	void setNext(ICarnetizacion handler);
	ICarnetizacion next();
    void revisarRequisitos(Persona persona);
}
