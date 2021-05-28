package factoryMethod.ejercicios;

public class CreatorPasajeSolidario extends CreatorPasaje{

	@Override
	public PasajeSolidario create() {
		Avion avion = new Avion();
		avion.setCapacidad(110);
		avion.setMarca("TAM");
		avion.setModelo("Boeing 747");
		avion.setNumeroDeAsientos(100);
		
		Destino destino = new Destino();
		destino.setAeropuerto("Internacional Jorge Wilstermann");
		destino.setCiudad("Cochabamba");
		destino.setPais("Bolivia");
		
		Origen origen = new Origen();
		origen.setAeropuerto("Internacional El Alto");
		origen.setCiudad("El Alto");
		origen.setPais("Bolivia");
		
		Pasajero pasajero = new Pasajero();
		pasajero.setCI(7317859);
		pasajero.setNombre("Federico Perez");
		
		PasajeSolidario pasaje = new PasajeSolidario();
		pasaje.setAvion(avion);
		pasaje.setCostoDePasaje(300);
		pasaje.setDestino(destino);
		pasaje.setNumeroAsiento("20A");
		pasaje.setOrigen(origen);
		pasaje.setPasajero(pasajero);
		pasaje.setDescuento(20);
		pasaje.setMotivoDelDescuento("Tercera edad");
		return pasaje;
	}

}