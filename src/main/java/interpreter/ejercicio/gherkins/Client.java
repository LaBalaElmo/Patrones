package interpreter.ejercicio.gherkins;

public class Client {
	public static void main(String[] args) {
		String enunciado = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

		InterpreterGherkins interpreterNumero = new InterpreterGherkins(enunciado);
		System.out.println("Enunciado: " + enunciado);
		System.out.println("Enunciado traducido:" + interpreterNumero.interpretar());
	}
}
