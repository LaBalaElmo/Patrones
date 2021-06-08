package chainOfResponsability.ejercicio.ejercicio1;

public class ProcesoCarnetizacion implements ICarnetizacion{
	private  ICarnetizacion next;
	
	@Override
	public void setNext(ICarnetizacion handler) {
		this.next=handler;	
	}

	@Override
	public ICarnetizacion next() {
		return this.next;
	}

	@Override
	public void revisarRequisitos(Persona persona) {
		ResponsableCarnetizacion responsable = new ResponsableCarnetizacion();
        this.setNext(responsable);

        Notario notario = new Notario();
        responsable.setNext(notario);

        Cajero cajero = new Cajero();
        notario.setNext(cajero);
        
        AyudaAlCliente ayuda = new AyudaAlCliente();
        cajero.setNext(ayuda);

        this.next.revisarRequisitos(persona);
		
	}
}