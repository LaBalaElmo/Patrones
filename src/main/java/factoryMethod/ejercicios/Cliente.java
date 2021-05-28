package factoryMethod.ejercicios;

//import java.util.Scanner;

public class Cliente {

//	public enum Colores {
//		ROJO, AMARILLO, AZUL, BLANCO, NEGRO
//	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String c = sc.next();		
//		Colores colores = Colores.valueOf(c);
//		
//		switch (colores) {
//		case ROJO:
//			System.out.println("FF0000");
//			break;
//		case AMARILLO:
//			System.out.println("FFFF00");
//			break;
//		case AZUL:
//			System.out.println("0000FF");
//			break;
//		case BLANCO:
//			System.out.println("FFFFFF");
//			break;
//		case NEGRO:
//			System.out.println("OAOAOA");
//			break;
//		default:
//			System.out.println("Color no valido");
//			break;
//		}

		CreatorPasaje pasaje1 = new CreatorPasajeInfante();
		PasajeInfante pasajeInfante1 = (PasajeInfante) pasaje1.create();
		Pasajero p1 = new Pasajero();
		p1.setCI(7896523);
		p1.setNombre("Pedro Alonso");
		pasajeInfante1.setPasajero(p1);
		pasajeInfante1.setNumeroAsiento("10C");
		PasajeInfante pasajeInfante2 = (PasajeInfante) pasaje1.create();
		Pasajero p2 = new Pasajero();
		p2.setCI(3100256);
		p2.setNombre("Carlos Paez");
		pasajeInfante2.setPasajero(p2);
		pasajeInfante2.setNumeroAsiento("25C");
		
		pasajeInfante1.crear();
		pasajeInfante2.crear();
		
		CreatorPasaje pasaje2 = new CreatorPasajeStandart();
		PasajeStandart pasajeStandart1 = (PasajeStandart) pasaje2.create();
		Pasajero p3 = new Pasajero();
		p3.setCI(3695248);
		p3.setNombre("Joaquin Huanca");
		pasajeStandart1.setPasajero(p3);
		pasajeStandart1.setNumeroAsiento("23D");
		PasajeStandart pasajeStandart2 = (PasajeStandart) pasaje2.create();
		Pasajero p4 = new Pasajero();
		p4.setCI(3215847);
		p4.setNombre("Carlos Lopez");
		pasajeStandart2.setPasajero(p4);
		pasajeStandart2.setNumeroAsiento("36A");
		
		pasajeStandart1.crear();
		pasajeStandart2.crear();
		
		CreatorPasaje pasaje3 = new CreatorPasajeSolidario();
		PasajeSolidario pasajeSolidario1 = (PasajeSolidario) pasaje3.create();
		Pasajero p5 = new Pasajero();
		p5.setCI(3845692);
		p5.setNombre("Roberto Gomez");
		pasajeSolidario1.setPasajero(p5);
		pasajeSolidario1.setNumeroAsiento("40F");
		PasajeSolidario pasajeSolidario2 = (PasajeSolidario) pasaje3.create();
		Pasajero p6 = new Pasajero();
		p6.setCI(3698201);
		p6.setNombre("Hector Escobar");
		pasajeSolidario2.setPasajero(p6);
		pasajeSolidario2.setNumeroAsiento("22E");
		
		pasajeSolidario1.crear();
		pasajeSolidario2.crear();
	}
}
