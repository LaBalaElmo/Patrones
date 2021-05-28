package iterator.ejercicios;

import java.util.Stack;

public class Stack1 implements IList {
	private Stack<String> empleados;

	public Stack1() {
		empleados = new Stack<>();
	}

	public void add(String empleado) {
		empleados.push(empleado);
	}

	@Override
	public IteratorConcreteStack1 iterator() {
		return new IteratorConcreteStack1(this.empleados);
	}

}
