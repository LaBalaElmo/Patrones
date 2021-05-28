package interpreter.ejercicio.gherkins;

import java.util.ArrayList;
import java.util.List;

public class Context {
	protected String input = "";
	protected String output = "";
	protected List<String> lista = new ArrayList<>();;

	public Context(String input, List<String> list) {
		this.input = input;
		this.lista = list;
	}
}
