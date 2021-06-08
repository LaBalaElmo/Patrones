package chainOfResponsability.ejercicio;

public class EmpresaSoftware implements IServicioSoftware{
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
		DevOps devOps = new DevOps();
        this.setNext(devOps);

        QA qa = new QA();
        devOps.setNext(qa);

        Developer developer = new Developer();
        qa.setNext(developer);

        Finanzas finanzas = new Finanzas();
        developer.setNext(finanzas);
        
        Support support = new Support();
        finanzas.setNext(support);

        this.next.revisarSolicitud(solicitud);
		
	}
}