package ejercciosPrimerParcial.builder;

public abstract class BuilderPlato {
	protected Plato plato;

	public Plato getProduct() {
		return plato;
	}

	public void createProduct() {
		plato = new Plato();
	}

	public abstract void buildCarne();

	public abstract void buildRefresco();

	public abstract void buildGuarnicion();

}
