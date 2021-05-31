package ejercciosPrimerParcial.builder;

public class Cliente {
	private int numFicha;
	private Plato plato;

	public Cliente(int numFicha, Plato plato) {
		this.numFicha = numFicha;
		this.plato = plato;
	}

	public int getNumFicha() {
		return numFicha;
	}

	public void setNumFicha(int numFicha) {
		this.numFicha = numFicha;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

}
