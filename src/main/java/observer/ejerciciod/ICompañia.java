package observer.ejerciciod;

public interface ICompa�ia {
	 void attach(ICliente observer);
	    void deattach(ICliente observer);
	    void notifyObserver(String notificacion);
}
