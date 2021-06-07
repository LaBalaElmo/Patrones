package mediator.ejercicio;

public class SM extends Colleague {
	private int certificaciones;

	public SM(ICanalDeComunicacion mediator, String name, int ci, int certificaciones) {
		super(mediator, name, ci);
		this.certificaciones = certificaciones;
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);

	}

	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Message Received SM, " + certificaciones + ", " + name + ">" + message);

	}

}
