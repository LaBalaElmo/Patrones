package strategy.ejercicio;

import java.util.List;

public class Invierno implements IVentas {

	@Override
	public void eVenta(List<Ropa> ropaList) {
		System.out.println("Es invierno, las prendas suben un 10% mas");
		for (Ropa ropa : ropaList) {
			System.out.println("El precio de la ropa es: " + (ropa.getPrecio() * 1.1));
			System.out.println("El tipo de ropa es: " + ropa.getTipo());
		}
		System.out.println("**********************");
	}

}
