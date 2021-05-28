package builder.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaClasica extends BuilderPizza{

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes(new ArrayList<>(Arrays.asList("salsa de tomate")));
		
	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("Masa especial");
		
	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQueso("Doble queso mozarella");
		
	}

}
