package strategy.ejercicio;

import java.util.List;

public class Oto�o implements IVentas {

	@Override
	public void eVenta(List<Ropa> ropaList) {
		System.out.println("Es oto�o, las los precios bajan un 50%");
		for (Ropa ropa : ropaList) {
			System.out.println("El precio de la ropa es: " + (ropa.getPrecio() / 2));
			System.out.println("El tipo de ropa es: " + ropa.getTipo());
		}
		System.out.println("**********************");
	}

}
