package builder.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaCarnivora extends BuilderPizza{

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes(new ArrayList<>(Arrays.asList("carne", "salsa de tomate", "chorizo")));
		
	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("Masa especial");
		
	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQueso("Queso mozarella");
		
	}

}
