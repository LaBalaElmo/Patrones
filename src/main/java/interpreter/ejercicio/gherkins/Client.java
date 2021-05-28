package interpreter.ejercicio.gherkins;

public class Client {
	public static void main(String[] args) {
		String enunciado = "Como [ usuario ] Quiero [accciones] Para [valor de la story]";

		InterpreterGherkins interpreterNumero = new InterpreterGherkins(enunciado);
		System.out.println("Enunciado: " + enunciado);
		System.out.println("Enunciado traducido:" + interpreterNumero.interpretar());
	}
}
