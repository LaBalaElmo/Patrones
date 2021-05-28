package builder.ejercicios;

public class Client {
	public static void main(String[] args) {
		Pizzero juan= new Pizzero();
        PizzaCarnivora carnivora = new PizzaCarnivora();
        PizzaClasica clasica = new PizzaClasica();
        PizzaHawaiana hawaiana = new PizzaHawaiana();
        
        juan.setBuilderPizza(carnivora);
        juan.hornearPizza();

        Pizza pizzaCarnivora = juan.getPizza();
        pizzaCarnivora.showData();

        juan.setBuilderPizza(clasica);
        juan.hornearPizza();

        Pizza pizzaClasica = juan.getPizza();
        pizzaClasica.showData();
        
        juan.setBuilderPizza(hawaiana);
        juan.hornearPizza();

        Pizza pizzaHawaiana = juan.getPizza();
        pizzaHawaiana.showData();
	}
}
