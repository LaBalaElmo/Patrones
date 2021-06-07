package memento.ejercicio;

import java.util.ArrayList;

public class Memento {
	private ArrayList<Persona> state = new ArrayList<>();

	public Memento(ArrayList<Persona> stateSaved) {
		state = stateSaved;
	}

	public ArrayList<Persona> getState() {
		return state;
	}

}
