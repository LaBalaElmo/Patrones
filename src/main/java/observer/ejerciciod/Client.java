package observer.ejerciciod;

public class Client {
	public static void main(String[] args) {
		 Compa�iaTelefonica compa�ia = new Compa�iaTelefonica();

	        ClienteRegistrado user1= new ClienteRegistrado(new Persona("123","Juan"),"precios promociones premios noticias");
	        ClienteRegistrado user2= new ClienteRegistrado(new Persona("124","Juan1"),"precios promociones");
	        ClienteRegistrado user3= new ClienteRegistrado(new Persona("125","Juan2"),"premios noticias");
	        ClienteRegistrado user4= new ClienteRegistrado(new Persona("126","Juan3"),"promociones");
	        ClienteRegistrado user5= new ClienteRegistrado(new Persona("127","Juan4"),"");

	        compa�ia.attach(user1);
	        compa�ia.attach(user2);
	        compa�ia.attach(user3);
	        compa�ia.attach(user4);
	        compa�ia.attach(user5);


	        compa�ia.addNotificacion("premios");
	        compa�ia.addNotificacion("promociones");
	}
}
