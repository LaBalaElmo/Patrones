package builder.ejercicios;

public class Pizzero {
	private BuilderPizza builderPizza;

	public Pizza getPizza() {
		return builderPizza.getPizza();
	}

	public void setBuilderPizza(BuilderPizza builderPizza) {
		this.builderPizza = builderPizza;
	}
	
	public void hornearPizza() {
		this.builderPizza.createPizza();
		this.builderPizza.buildIngredientes();
		this.builderPizza.buildTipoMasa();
		this.builderPizza.buildTipoQueso();
	}
	
}
