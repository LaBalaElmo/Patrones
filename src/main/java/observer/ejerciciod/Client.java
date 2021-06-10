package observer.ejerciciod;

public class Client {
	public static void main(String[] args) {
		 CompaņiaTelefonica compaņia = new CompaņiaTelefonica();

	        ClienteRegistrado user1= new ClienteRegistrado(new Persona("123","Juan"),"precios promociones premios noticias");
	        ClienteRegistrado user2= new ClienteRegistrado(new Persona("124","Juan1"),"precios promociones");
	        ClienteRegistrado user3= new ClienteRegistrado(new Persona("125","Juan2"),"premios noticias");
	        ClienteRegistrado user4= new ClienteRegistrado(new Persona("126","Juan3"),"promociones");
	        ClienteRegistrado user5= new ClienteRegistrado(new Persona("127","Juan4"),"");

	        compaņia.attach(user1);
	        compaņia.attach(user2);
	        compaņia.attach(user3);
	        compaņia.attach(user4);
	        compaņia.attach(user5);


	        compaņia.addNotificacion("premios");
	        compaņia.addNotificacion("promociones");
	}
}
