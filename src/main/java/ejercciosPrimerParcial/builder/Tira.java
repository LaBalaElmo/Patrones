package ejercciosPrimerParcial.builder;

public class Tira extends BuilderPlato {

	@Override
	public void buildCarne() {
		plato.setTipoCarne("Tira de carne");
	}

	@Override
	public void buildRefresco() {
		plato.setSaborRefresco("Coca cola");
	}

	@Override
	public void buildGuarnicion() {
		plato.setGuarnicion("Fideo");
	}

}
