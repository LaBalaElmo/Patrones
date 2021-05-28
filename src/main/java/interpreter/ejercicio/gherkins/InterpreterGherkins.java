package interpreter.ejercicio.gherkins;

import java.util.ArrayList;
import java.util.List;

public class InterpreterGherkins extends AbstractExpresion {
	private List<AbstractExpresion> parseTree = new ArrayList<>();
	private Context context;

	public InterpreterGherkins(String word) {
		this.interpretacion(word);
	}

	public void interpretacion(String words) {
		String input = words;
		String[] aux = input.split(" ");
		List<String> in = new ArrayList<>();
		for (int i = 0; i < aux.length; i++) {
			in.add(aux[i]);
		}
		context = new Context(input, in);
		for (String word : input.split(" ")) {
			switch (word) {
			case "Como":
				parseTree.add(new TerminalComo());
				break;
			case "Para":
				parseTree.add(new TerminalPara());
				break;
			case "Quiero":
				parseTree.add(new TerminalQuiero());
				break;
			default:
				break;
			}

		}
	}

	public String interpretar() {
		for (AbstractExpresion terminalExpresion : parseTree) {
			terminalExpresion.interpreter(context);
		}
		return context.output;
	}

	@Override
	public void interpreter(Context context) {

	}
}
