package ejercciosPrimerParcial.factoryMethod;

public class CreatorKitEscolar extends CreatorKit {

	@Override
	public KitEscolar create() {
		KitEscolar kit = new KitEscolar();
		kit.setCuaderno(new Cuaderno("anillado", 100));
		kit.setDeportivo(new Deportivo(30, "rojo", 2));
		kit.setMochila(new Mochila(5, "Grande"));
		return kit;
	}

}
