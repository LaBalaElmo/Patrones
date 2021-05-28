package iterator.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class List1 implements IList {
	private List<String> empleados;

	public List1() {
		empleados = new ArrayList<>();
	}

	public void add(String empleado) {
		empleados.add(empleado);
	}

	@Override
	public IteratorConcreteList1 iterator() {
		return new IteratorConcreteList1(this.empleados);
	}

}
