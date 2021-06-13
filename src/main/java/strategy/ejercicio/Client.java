package strategy.ejercicio;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		ArrayList<Ropa> listRopa = new ArrayList<>();
		PrecioRopa precio = new PrecioRopa();
		
		listRopa.add(new Ropa("Polera", 50));
		listRopa.add(new Ropa("Camisa", 30));
		listRopa.add(new Ropa("Corbata", 20));
		listRopa.add(new Ropa("Zapato", 200));
		listRopa.add(new Ropa("Chaqueta", 250));
		listRopa.add(new Ropa("Pantalon", 180));
		listRopa.add(new Ropa("Medias", 10));
		listRopa.add(new Ropa("Chamarra", 500));
		listRopa.add(new Ropa("Buso", 100));
		listRopa.add(new Ropa("Tenis", 400));
		
		precio.setRopaList(listRopa);
		
		precio.setVentas(new Otoño());
		precio.execute();
		
		precio.setVentas(new Primavera());
		precio.execute();
		
		precio.setVentas(new Invierno());
		precio.execute();
		
		precio.setVentas(new Verano());
		precio.execute();
	}
}
