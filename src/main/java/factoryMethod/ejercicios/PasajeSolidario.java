package factoryMethod.ejercicios;

public class PasajeSolidario implements IPasaje {
	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private String numeroAsiento;
	private int costoDePasaje;
	private int descuento;
	private String motivoDelDescuento;

	public PasajeSolidario() {
		destino = new Destino();
		origen = new Origen();
		avion = new Avion();
		pasajero = new Pasajero();
	}

	@Override
	public void crear() {
		System.out.println("*********************************");
		System.out.println("Pasaje Solidario - Numero de asiento: " + numeroAsiento);
		System.out.println("Pasaje Solidario - Costo de Pasaje: " + costoDePasaje);
		System.out.println("Pasaje Solidario - Descuento: " + descuento);
		System.out.println("Pasaje Solidario - Motivo del descuento: " + motivoDelDescuento);
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

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public String getMotivoDelDescuento() {
		return motivoDelDescuento;
	}

	public void setMotivoDelDescuento(String motivoDelDescuento) {
		this.motivoDelDescuento = motivoDelDescuento;
	}
}
