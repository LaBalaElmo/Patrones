package mediator.ejercicio;

public class Client {
	public static void main(String[] args) {
		Skype skype = new Skype();

		DEV dev1 = new DEV(skype, "Juan", 7895263, "Java");
		DEV dev2 = new DEV(skype, "Jose", 4596885, "Java");
		DEV dev3 = new DEV(skype, "Pedro", 4582663, "Java");

		QA qa1 = new QA(skype, "Jorge", 8524569, "Alto");
		QA qa2 = new QA(skype, "Jaime", 7458963, "Alto");
		QA qa3 = new QA(skype, "Julio", 7128586, "Alto");

		SM sm1 = new SM(skype, "Roberto", 7896523, true);
		SM sm2 = new SM(skype, "Diego", 7523698, true);
		SM sm3 = new SM(skype, "Carlos", 7412589, true);
		
		skype.addPersonasAlChat(dev1);
		skype.addPersonasAlChat(dev2);
		skype.addPersonasAlChat(dev3);
		skype.addPersonasAlChat(qa1);
		skype.addPersonasAlChat(qa2);
		skype.addPersonasAlChat(qa3);
		skype.addPersonasAlChat(sm1);
		skype.addPersonasAlChat(sm2);
		skype.addPersonasAlChat(sm3);
		
		
		dev1.send("Hola");
		qa1.send("prueba");
		sm1.send("prueba para todos");

	}
}
