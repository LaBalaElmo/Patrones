package observer.ejerciciod;

public interface ICompañia {
	 void attach(ICliente observer);
	    void deattach(ICliente observer);
	    void notifyObserver(String notificacion);
}
