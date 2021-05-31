package ejercciosPrimerParcial.builder;

public class Cocinero {
	private BuilderPlato builder;

	public Plato getProduct() {
		return builder.getProduct();
	}

	public void setBuilder(BuilderPlato builder) {
		this.builder = builder;
	}

	public void buildProduct() {
		this.builder.createProduct();
		this.builder.buildCarne();
		this.builder.buildGuarnicion();
		this.builder.buildRefresco();
	}
}
