package chainOfResponsability.ejercicio;

public class Support implements IServicioSoftware {
	private IServicioSoftware next;

	@Override
	public void setNext(IServicioSoftware handler) {
		this.next = handler;
	}

	@Override
	public IServicioSoftware next() {
		return this.next;
	}

	@Override
	public void revisarSolicitud(Solicitud solicitud) {
		System.out.println("INFO> Revisando solicitud por el soporte");

	}
}