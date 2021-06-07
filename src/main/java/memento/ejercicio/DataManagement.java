package memento.ejercicio;

import java.util.ArrayList;

public class DataManagement {
	private ArrayList<Persona> state = new ArrayList<>();

	public void setState(Persona state) {
		System.out.println("**** Set State *****");
		state.info();
		this.state.add(state);
	}

	@SuppressWarnings("unchecked")
	public Memento createBackup() {
		System.out.println("**** Create State *****");
		return new Memento((ArrayList<Persona>) state.clone());
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getState();
		System.out.println("**** State Restored *****");
		for (int i = 0; i < memento.getState().size(); i++) {
			memento.getState().get(i).info();
			;
		}
	}
}
