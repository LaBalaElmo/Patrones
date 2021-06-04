package mediator.ejercicio;

public abstract class Colleague {
	protected ICanalDeComunicacion mediator;
	protected String name;
	protected int ci;

	public Colleague(ICanalDeComunicacion mediator, String name, int ci) {
		this.mediator = mediator;
		this.name = name;
		this.ci = ci;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public abstract void send(String message);

	public abstract void messageReceived(String message);
}
