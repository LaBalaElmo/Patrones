package chainOfResponsability.ejercicio.ejercicio1;

public class AyudaAlCliente implements ICarnetizacion {
	private ICarnetizacion next;

	@Override
	public void setNext(ICarnetizacion handler) {
		this.next = handler;
	}

	@Override
	public ICarnetizacion next() {
		return this.next;
	}

	@Override
	public void revisarRequisitos(Persona persona) {
		if (!persona.isCertificadoDeNacimiento()) {
			System.out.println("INFO> Se requiere certificado de nacimiento");
		}
		if (!persona.isFicha()) {
			System.out.println("INFO> Se requiere ficha");
		}
		if (!persona.isPagoAlBanco()) {
			System.out.println("INFO> Se requiere pago al banco");
		}

	}
}