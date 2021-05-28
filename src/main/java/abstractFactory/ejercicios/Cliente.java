package abstractFactory.ejercicios;

import abstractFactory.ejercicios.FactoryPasaje.Pasaje;

public class Cliente {

	public static void main(String[] args) {
		FactoryPasaje.make(Pasaje.PASAJE_INFANTE).crear();
		FactoryPasaje.make(Pasaje.PASAJE_STANDART).crear();
		FactoryPasaje.make(Pasaje.PASAJE_SOLIDARIO).crear();
	        
	}
}
