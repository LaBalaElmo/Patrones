package abstractFactory.ejercicios;

public class FactoryPasaje {
	
	public static enum Pasaje {
		PASAJE_INFANTE, PASAJE_STANDART, PASAJE_SOLIDARIO
	}

	public static IPasaje make(Pasaje pasaje) {
		IPasaje pasajes = null;
		Avion avion;
		Destino destino;
		Origen origen;
		Pasajero pasajero;
		switch (pasaje) {
		case PASAJE_INFANTE:
			pasajes = new PasajeInfante();
			avion = new Avion();
			avion.setCapacidad(110);
			avion.setMarca("TAM");
			avion.setModelo("Boeing 747");
			avion.setNumeroDeAsientos(100);
			
			destino = new Destino();
			destino.setAeropuerto("Internacional Jorge Wilstermann");
			destino.setCiudad("Cochabamba");
			destino.setPais("Bolivia");
			
			origen = new Origen();
			origen.setAeropuerto("Internacional El Alto");
			origen.setCiudad("El Alto");
			origen.setPais("Bolivia");
			
			pasajero = new Pasajero();
			pasajero.setCI(7317859);
			pasajero.setNombre("Federico Perez");
			
			((PasajeInfante) pasajes).setAvion(avion);
			((PasajeInfante) pasajes).setCostoDePasaje(150);
			((PasajeInfante) pasajes).setDestino(destino);
			((PasajeInfante) pasajes).setNumeroAsiento("20A");
			((PasajeInfante) pasajes).setOrigen(origen);
			((PasajeInfante) pasajes).setPasajero(pasajero);
			break;
		case PASAJE_STANDART:
			pasajes = new PasajeStandart();
			avion = new Avion();
			avion.setCapacidad(110);
			avion.setMarca("TAM");
			avion.setModelo("Boeing 747");
			avion.setNumeroDeAsientos(100);
			
			destino = new Destino();
			destino.setAeropuerto("Internacional Jorge Wilstermann");
			destino.setCiudad("Cochabamba");
			destino.setPais("Bolivia");
			
			origen = new Origen();
			origen.setAeropuerto("Internacional El Alto");
			origen.setCiudad("El Alto");
			origen.setPais("Bolivia");
			
			pasajero = new Pasajero();
			pasajero.setCI(7317859);
			pasajero.setNombre("Federico Perez");
			
			((PasajeStandart) pasajes).setAvion(avion);
			((PasajeStandart) pasajes).setCostoDePasaje(300);
			((PasajeStandart) pasajes).setDestino(destino);
			((PasajeStandart) pasajes).setNumeroAsiento("20A");
			((PasajeStandart) pasajes).setOrigen(origen);
			break;
		case PASAJE_SOLIDARIO:
			pasajes = new PasajeSolidario();
			avion = new Avion();
			avion.setCapacidad(110);
			avion.setMarca("TAM");
			avion.setModelo("Boeing 747");
			avion.setNumeroDeAsientos(100);
			
			destino = new Destino();
			destino.setAeropuerto("Internacional Jorge Wilstermann");
			destino.setCiudad("Cochabamba");
			destino.setPais("Bolivia");
			
			origen = new Origen();
			origen.setAeropuerto("Internacional El Alto");
			origen.setCiudad("El Alto");
			origen.setPais("Bolivia");
			
			pasajero = new Pasajero();
			pasajero.setCI(7317859);
			pasajero.setNombre("Federico Perez");
 
			((PasajeSolidario) pasajes).setAvion(avion);
			((PasajeSolidario) pasajes).setCostoDePasaje(300);
			((PasajeSolidario) pasajes).setDestino(destino);
			((PasajeSolidario) pasajes).setNumeroAsiento("20A");
			((PasajeSolidario) pasajes).setOrigen(origen);
			((PasajeSolidario) pasajes).setPasajero(pasajero);
			((PasajeSolidario) pasajes).setDescuento(20);
			((PasajeSolidario) pasajes).setMotivoDelDescuento("Tercera edad");
			break;
		default:
			System.out.println("Pasaje no disponible");
		}
		return pasajes;
	}
}
