package ejercciosPrimerParcial.factoryMethod;

public class KitEscolar implements IKit {
	private Mochila mochila;
	private Deportivo deportivo;
	private Cuaderno cuaderno;

	public Mochila getMochila() {
		return mochila;
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public Deportivo getDeportivo() {
		return deportivo;
	}

	public void setDeportivo(Deportivo deportivo) {
		this.deportivo = deportivo;
	}

	public Cuaderno getCuaderno() {
		return cuaderno;
	}

	public void setCuaderno(Cuaderno cuaderno) {
		this.cuaderno = cuaderno;
	}

	@Override
	public void create() {
		System.out.println("*************************");
		mochila.showInfo();
		deportivo.showInfo();
		cuaderno.showInfo();
	}

}
