package chainOfResponsability.ejercicio;

public interface IServicioSoftware {
	void setNext(IServicioSoftware handler);
	IServicioSoftware next();
    void revisarSolicitud(Solicitud solicitud);
}
