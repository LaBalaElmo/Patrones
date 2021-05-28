package interpreter.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class InterpreterNumbers extends AbstractExpresion {

	private List<AbstractExpresion> parseTree = new ArrayList<>();
	private Context context;

	public InterpreterNumbers(int number) {
		this.interpretacion(number);
	}

	public void interpretacion(int number) {
        int input = number;
        context= new Context(input);
        while (input > 0) {
        	String aux = Integer.toString(input);
        	int last = Integer.parseInt(Character.toString(aux.charAt(aux.length()-1)));
        	if(last == 0 && input > 9) {
        		parseTree.add(new TerminalExpresionX(input / 10));
        		input = 0;
        	}else if(last < 4) {
            	input = input - last;
            	parseTree.add(new TerminalExpresionI(last));
            }else if(last < 6) {
            	int p = 5 - last;
            	parseTree.add(new TerminalExpresionV(1));
            	parseTree.add(new TerminalExpresionI(p));
            	input -=last;
            }else if(last < 9) {
            	int p = last - 5;
            	parseTree.add(new TerminalExpresionI(p));
            	parseTree.add(new TerminalExpresionV(1));
            	input -=last;
            }else{
            	parseTree.add(new TerminalExpresionX(1));
            	parseTree.add(new TerminalExpresionI(1));
            	input -=last;
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
