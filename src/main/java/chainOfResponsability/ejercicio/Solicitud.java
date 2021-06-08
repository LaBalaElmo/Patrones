package chainOfResponsability.ejercicio;

public class Solicitud {
	private String tipoSolicitud;

	public Solicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public String getSolicitud() {
		return tipoSolicitud;
	}

	public void setSolicitud(String solicitud) {
		this.tipoSolicitud = solicitud;
	}

	public void error() {
		System.out.println("INFO> Solicitando informacion del error");
	}

	public void aislar() {
		System.out.println("INFO> Aislando el error");
	}

	public void funcionalidad() {
		System.out.println("INFO> Estimando la nueva funcinalidad");
	}

	public void costos() {
		System.out.println("INFO> Evaluando peticion de costos");
	}

}
