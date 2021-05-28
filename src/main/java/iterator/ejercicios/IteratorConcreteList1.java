package iterator.ejercicios;

import java.util.List;

public class IteratorConcreteList1 implements Iterator {
	private List<String> empleados;
	private int position;

	public IteratorConcreteList1(List<String> empleados) {
		this.empleados = empleados;
		this.position = 0;
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
