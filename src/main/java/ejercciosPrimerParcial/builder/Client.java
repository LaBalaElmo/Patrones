package ejercciosPrimerParcial.builder;

public class Client {
	public static void main(String[] args) {
		Cocinero cocinero = new Cocinero();
		Bife bife = new Bife();
		Lomito lomo = new Lomito();
		Tira tira = new Tira();

		cocinero.setBuilder(bife);
		cocinero.buildProduct();

		Plato biff = cocinero.getProduct();
		biff.showData();

		cocinero.setBuilder(lomo);
		cocinero.buildProduct();

		Plato lomito = cocinero.getProduct();
		lomito.showData();
		
		cocinero.setBuilder(tira);
		cocinero.buildProduct();

		Plato tiraCarne = cocinero.getProduct();
		tiraCarne.showData();
	}
}
