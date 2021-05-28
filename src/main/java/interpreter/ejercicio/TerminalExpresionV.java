package interpreter.ejercicio;

public class TerminalExpresionV extends AbstractExpresion {

	public TerminalExpresionV(int val) {
		this.val = val;
	}

	@Override
	public void interpreter(Context context) {

		if (context.input > 0) {
			for (int i = 0; i < val; i++) {
				context.output = "V" + context.output;
				context.input = context.input - 5;
			}
		}
	}
}
