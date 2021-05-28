package iterator.ejercicios;

import java.util.Vector;

public class IteratorConcreteVector1 implements Iterator {
	private Vector<String> empleados;
	private int position;

	public IteratorConcreteVector1(Vector<String> empleados) {
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
