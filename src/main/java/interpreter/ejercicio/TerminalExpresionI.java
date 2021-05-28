package interpreter.ejercicio;

public class TerminalExpresionI extends AbstractExpresion {

	public TerminalExpresionI(int val) {
		this.val = val;
	}

	@Override
	public void interpreter(Context context) {
		if (context.input > 0) {
			for (int i = 0; i < val; i++) {
				context.output = "I" + context.output;
				context.input = context.input - 1;
			}
		}
	}

}
