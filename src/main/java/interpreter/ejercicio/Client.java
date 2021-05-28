package interpreter.ejercicio;

public class Client {
	public static void main(String[] args) {
		
		//Devuelve el numero romano del 1 a 39
		int number = 37;

        InterpreterNumbers interpreterNumero = new InterpreterNumbers(number);
        System.out.println("Numero: "+number);
        System.out.println("Numero Romano: "+interpreterNumero.interpretar());
	}
}
