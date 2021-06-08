package chainOfResponsability.ejercicio.ejercicio1;

public class Cajero implements ICarnetizacion{
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
		if(persona.isCertificadoDeNacimiento() && persona.isFicha() && !persona.isPagoAlBanco()) {
			System.out.println("INFO> Se requiere pago al banco");
			System.out.println("INFO> Pagando al banco, atendiendo");
			persona.setPagoAlBanco(true);
			this.next = new ResponsableCarnetizacion();
			this.next.revisarRequisitos(persona);
		}else {
			this.next.revisarRequisitos(persona);
		}
		
	}
}