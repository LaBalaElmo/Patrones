package interpreter.ejercicio;

public class TerminalExpresionX extends AbstractExpresion {

	public TerminalExpresionX(int val) {
		this.val = val;
	}

	@Override
	public void interpreter(Context context) {

		if (context.input > 0) {
			for (int i = 0; i < val; i++) {
				context.output = "X" + context.output;
				context.input = context.input - 10;
			}
		}
	}
}
