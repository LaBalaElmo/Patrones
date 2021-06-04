package mediator.ejercicio;

public class DEV extends Colleague {
	private String lenguaje;

	public DEV(ICanalDeComunicacion mediator, String name, int ci, String lenguaje) {
		super(mediator, name, ci);
		this.lenguaje = lenguaje;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);

	}

	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Message Received DEV, " + lenguaje + ", " + name + ">" + message);

	}

}
