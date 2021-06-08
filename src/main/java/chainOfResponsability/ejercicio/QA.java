package chainOfResponsability.ejercicio;

public class QA implements IServicioSoftware {
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
		if (solicitud.getSolicitud().equals("Bug") || solicitud.getSolicitud().equals("Mejora")) {
			solicitud.aislar();
		} else {
			this.next.revisarSolicitud(solicitud);
		}

	}
}