package chainOfResponsability.ejercicio.ejercicio1;

public class ResponsableCarnetizacion implements ICarnetizacion{
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
		if(persona.isCertificadoDeNacimiento() && persona.isFicha() && persona.isPagoAlBanco()) {
			System.out.println("INFO> Se tienen todos los requerimientos, pasando con el responsable de carnetizacion");
		}else {
			this.next.revisarRequisitos(persona);
		}
		
	}
}