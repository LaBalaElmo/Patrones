package iterator.ejercicios;

import java.util.HashMap;

public class IteratorConcreteHashMap1 implements Iterator {
	private HashMap<String, Object> empresas;
	private int position;

	public IteratorConcreteHashMap1(HashMap<String, Object> empresas) {
		this.empresas = empresas;
		position = 0;
	}

	@Override
	public Object next() {
		Object[] aux = empresas.values().toArray();
		return aux[position++];
	}

	@Override
	public boolean hasNext() {
		return !empresas.isEmpty() && position < empresas.size();
	}

}
