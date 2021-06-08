package chainOfResponsability.ejercicio.ejercicio1;

public class Notario implements ICarnetizacion{
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
		if(!persona.isCertificadoDeNacimiento() && persona.isFicha() && persona.isPagoAlBanco()) {
			System.out.println("INFO> Se requiere certificado de nacimiento");
			System.out.println("INFO> Sacando certificado de nacimiento, atendiendo");
			this.next = new ResponsableCarnetizacion();
			persona.setCertificadoDeNacimiento(true);
			this.next.revisarRequisitos(persona);
		}else {
			this.next.revisarRequisitos(persona);
		}
		
	}
}