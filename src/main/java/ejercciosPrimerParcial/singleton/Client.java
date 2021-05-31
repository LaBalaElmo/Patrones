package ejercciosPrimerParcial.singleton;

public class Client {
	public static void main(String[] args) {
		Cajero cajero = new Cajero("Javier");
		cajero.ingresarContraseña("12345678");
		System.out.println(cajero.getMonto());
		
		Cajero cajero2 = new Cajero("Roberto");
			
		Estudiante estudiante1 = new Estudiante("Jose", 51895);
		Estudiante estudiante2 = new Estudiante("Pedro", 69852);
		Estudiante estudiante3 = new Estudiante("Juan", 25489);
		Estudiante estudiante4 = new Estudiante("Carlos", 36952);
		Estudiante estudiante5 = new Estudiante("Hank", 48526);
		
		estudiante1.pagar(cajero, 100);
		estudiante2.pagar(cajero, 200);
		estudiante3.pagar(cajero, 150);
		estudiante4.pagar(cajero, 300);
		
		System.out.println(cajero.getMonto());
		
		estudiante5.pagar(cajero2, 250);
		
		System.out.println(cajero2.getMonto());
	}
}
