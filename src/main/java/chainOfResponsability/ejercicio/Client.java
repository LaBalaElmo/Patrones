package chainOfResponsability.ejercicio;

public class Client {
	public static void main(String[] args) {
		EmpresaSoftware empresa = new EmpresaSoftware();
		empresa.revisarSolicitud(new Solicitud("Nueva Funcionalidad"));
		empresa.revisarSolicitud(new Solicitud("Infrestructura"));
		empresa.revisarSolicitud(new Solicitud("Costos"));
		empresa.revisarSolicitud(new Solicitud("Bug"));
		empresa.revisarSolicitud(new Solicitud("RRHH"));
	}
}
