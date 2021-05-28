package iterator.ejercicios;

import java.util.Vector;

public class Vector1 implements IList {
	private Vector<String> empleados;

	public Vector1() {
		empleados = new Vector<>();
	}

	public void add(String empleado) {
		empleados.add(empleado);
	}

	@Override
	public IteratorConcreteVector1 iterator() {
		return new IteratorConcreteVector1(this.empleados);
	}

}
