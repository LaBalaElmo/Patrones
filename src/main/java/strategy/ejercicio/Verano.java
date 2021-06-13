package strategy.ejercicio;

import java.util.List;

public class Verano implements IVentas {

	@Override
	public void eVenta(List<Ropa> ropaList) {
		System.out.println("Es verano, las prendas bajan un 10%");
		for (Ropa ropa : ropaList) {
			System.out.println("El precio de la ropa es: " + (ropa.getPrecio() * 0.9));
			System.out.println("El tipo de ropa es: " + ropa.getTipo());
		}
		System.out.println("**********************");
	}

}
