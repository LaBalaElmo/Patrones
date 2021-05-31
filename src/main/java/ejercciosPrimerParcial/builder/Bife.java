package ejercciosPrimerParcial.builder;

public class Bife extends BuilderPlato {

	@Override
	public void buildCarne() {
		plato.setTipoCarne("Bife");
	}

	@Override
	public void buildRefresco() {
		plato.setSaborRefresco("Coca cola");
	}

	@Override
	public void buildGuarnicion() {
		plato.setGuarnicion("Papas fritas");
	}

}
