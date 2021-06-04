package mediator.ejercicio;

public class QA extends Colleague {
	private String grado;

	public QA(ICanalDeComunicacion mediator, String name, int ci, String grado) {
		super(mediator, name, ci);
		this.grado = grado;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Message Received QA, " + grado + ", " + name + ">" + message);
	}

}
