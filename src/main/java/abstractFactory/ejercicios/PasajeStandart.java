package abstractFactory.ejercicios;

public class PasajeStandart implements IPasaje {

	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private String numeroAsiento;
	private int costoDePasaje;

	public PasajeStandart() {
		destino = new Destino();
		origen = new Origen();
		avion = new Avion();
		pasajero = new Pasajero();
	}

	@Override
	public void crear() {
		System.out.println("****************************************");
		System.out.println("Pasaje Standart - Numero de asiento: " + numeroAsiento);
		System.out.println("Pasaje Standart - Costo de Pasaje: " + costoDePasaje);
		destino.showInfo();
		origen.showInfo();
		avion.showInfo();
		pasajero.showInfo();

	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public String getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	public int getCostoDePasaje() {
		return costoDePasaje;
	}

	public void setCostoDePasaje(int costoDePasaje) {
		this.costoDePasaje = costoDePasaje;
	}

}
