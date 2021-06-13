package strategy.ejercicio;

import java.util.List;

public class Primavera implements IVentas {

	@Override
	public void eVenta(List<Ropa> ropaList) {
		System.out.println("Es primaver, los precios se mantienen");
		for (Ropa ropa : ropaList) {
			System.out.println("El precio de la ropa es: " + (ropa.getPrecio()));
			System.out.println("El tipo de ropa es: " + ropa.getTipo());
		}
		System.out.println("**********************");
	}

}
