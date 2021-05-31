package ejercciosPrimerParcial.builder;

public class Lomito extends BuilderPlato{

	@Override
	public void buildCarne() {
		plato.setTipoCarne("Lomo");
	}

	@Override
	public void buildRefresco() {
		plato.setSaborRefresco("Pepsi");
	}

	@Override
	public void buildGuarnicion() {
		plato.setGuarnicion("Arroz");
	}

}
