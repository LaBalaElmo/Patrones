package chainOfResponsability.ejercicio;

public class Developer implements IServicioSoftware{
	private  IServicioSoftware next;
	
	@Override
	public void setNext(IServicioSoftware handler) {
		this.next=handler;	
	}

	@Override
	public IServicioSoftware next() {
		return this.next;
	}

	@Override
	public void revisarSolicitud(Solicitud solicitud) {
		if (solicitud.getSolicitud().equals("Nueva Funcionalidad") ){
           solicitud.funcionalidad();
        } else {
            this.next.revisarSolicitud(solicitud);
        }
		
	}

}
