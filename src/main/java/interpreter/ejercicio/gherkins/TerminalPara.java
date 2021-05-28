package interpreter.ejercicio.gherkins;

public class TerminalPara extends AbstractExpresion {

	@Override
	public void interpreter(Context context) {
		if (context.lista.get(0).equals("Para")) {
			context.output = context.output + " Then ";
			context.lista.remove(0);
			while (!context.lista.isEmpty() && !(context.lista.get(0).equals("Como")
					|| context.lista.get(0).equals("Para") || context.lista.get(0).equals("Quiero"))) {
				context.output = context.output + " " + context.lista.get(0);
				context.lista.remove(0);
			}
		}
	}
}
