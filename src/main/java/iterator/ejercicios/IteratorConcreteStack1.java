package iterator.ejercicios;

import java.util.Stack;

public class IteratorConcreteStack1 implements Iterator {
	private Stack<String> empleados;
	private int position;

	public IteratorConcreteStack1(Stack<String> empleados) {
		this.empleados = empleados;
		position = 0;
	}

	@Override
	public Object next() {
		return empleados.get(position++);
	}

	@Override
	public boolean hasNext() {
		return !empleados.isEmpty() && position < empleados.size();
	}

}
