package ejercciosPrimerParcial.factoryMethod;

public class CreatorKitColegial extends CreatorKit{

	@Override
	public KitColegial create() {
		KitColegial kit = new KitColegial();
		kit.setComputadora(new Computadora("Dell", "Windows"));
		kit.setLibro(new Libro("Fisica", "Sherway"));
		kit.setMochila(new Mochila(5, "Mediano"));
		return kit;
	}

}
