package iterator.ejercicios;

public class Arrays1 implements IList {
	private String[] empleados;
	private int position;

	public Arrays1() {
		this.empleados = new String[5];
		this.position = 0;
	}

	public void add(String value) {
		empleados[position] = value;
		position++;
	}

	@Override
	public IteratorConcreteArrays1 iterator() {
		return new IteratorConcreteArrays1(this.empleados);
	}
}
