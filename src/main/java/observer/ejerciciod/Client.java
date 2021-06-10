package observer.ejerciciod;

public class Client {
	public static void main(String[] args) {
		 CompañiaTelefonica compañia = new CompañiaTelefonica();

	        ClienteRegistrado user1= new ClienteRegistrado(new Persona("123","Juan"),"precios promociones premios noticias");
	        ClienteRegistrado user2= new ClienteRegistrado(new Persona("124","Juan1"),"precios promociones");
	        ClienteRegistrado user3= new ClienteRegistrado(new Persona("125","Juan2"),"premios noticias");
	        ClienteRegistrado user4= new ClienteRegistrado(new Persona("126","Juan3"),"promociones");
	        ClienteRegistrado user5= new ClienteRegistrado(new Persona("127","Juan4"),"");

	        compañia.attach(user1);
	        compañia.attach(user2);
	        compañia.attach(user3);
	        compañia.attach(user4);
	        compañia.attach(user5);


	        compañia.addNotificacion("premios");
	        compañia.addNotificacion("promociones");
	}
}
