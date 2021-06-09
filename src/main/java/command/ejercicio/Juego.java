package command.ejercicio;

public class Juego {
	private String titulo;
	private double version;

	public Juego(String titulo, double version) {
		this.titulo = titulo;
		this.version = version;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}
	
	public void showInfo(){
		System.out.println("Titulo: "+titulo);
        System.out.println("version: "+version);
    }

    public void atacar(){
        System.out.println("COMMAND>atacando....");
        this.showInfo();
    }

    public void defender(){
        System.out.println("COMMAND>defendiendo....");
        this.showInfo();
    }

    public void disparar(){
        System.out.println("COMMAND>disparando ... ");
        this.showInfo();
    }


}
