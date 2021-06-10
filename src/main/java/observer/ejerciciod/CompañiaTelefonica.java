package observer.ejerciciod;

import java.util.ArrayList;
import java.util.List;

public class CompañiaTelefonica implements ICompañia {
	private List<ICliente> observerList = new ArrayList<>();

	private List<String> notificacionList = new ArrayList<>();

	public void addNotificacion(String notificacion) {
		notificacionList.add(notificacion);
		this.notifyObserver(notificacion);
	}

	@Override
	public void attach(ICliente observer) {
		observerList.add(observer);
	}

	@Override
	public void deattach(ICliente observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver(String notificacion) {
		for (ICliente cliente : observerList) {
			String[] aux = cliente.getCategoria().toLowerCase().split(" ");
			for (int i = 0; i < aux.length; i++) {
				if (aux[i].equals(notificacion)) {
					cliente.update("Nueva notificacion", notificacion);
				}
			}

		}
	}

}
