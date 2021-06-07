package memento.ejercicio;

import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {

	private Map<String, Memento> stateSaved = new HashMap<>();

	public void addDataBase(String alias, Memento memento) {
		stateSaved.put(alias, memento);
	}

	public Memento getMemento(String alias) {
		return stateSaved.get(alias);
	}

}
