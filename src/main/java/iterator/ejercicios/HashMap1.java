package iterator.ejercicios;

import java.util.HashMap;

public class HashMap1 implements IList {
	private HashMap<String, Object> empresas;

	public HashMap1() {
		this.empresas = new HashMap<>();
	}

	public void add(String empresa, Object empleados) {
		empresas.put(empresa, empleados);
	}

	@Override
	public IteratorConcreteHashMap1 iterator() {
		return new IteratorConcreteHashMap1(this.empresas);
	}

}
