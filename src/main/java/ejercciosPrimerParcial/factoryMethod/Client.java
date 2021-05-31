package ejercciosPrimerParcial.factoryMethod;

public class Client {
	public static void main(String[] args) {
		KitColegial kitColegial = new CreatorKitColegial().create();
		KitEscolar kitEscolar = new CreatorKitEscolar().create();
		kitColegial.create();
		kitEscolar.create();
	}
}
