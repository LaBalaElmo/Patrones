package ejercciosPrimerParcial.prototype;

public class ContratoDocente implements IContrato {
	private int sueldo;
	private int cargaHoraria;
	private boolean cursoEducacionSuperior;
	private boolean accesoPlataforma;
	private boolean marcadoBiometrico;
	private String marcadoHoraDeEntrada;
	private String marcadoHoraDeSalida;
	private String nombre;
	private String apellido;

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public boolean isCursoEducacionSuperior() {
		return cursoEducacionSuperior;
	}

	public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
		this.cursoEducacionSuperior = cursoEducacionSuperior;
	}

	public boolean isAccesoPlataforma() {
		return accesoPlataforma;
	}

	public void setAccesoPlataforma(boolean accesoPlataforma) {
		this.accesoPlataforma = accesoPlataforma;
	}

	public boolean isMarcadoBiometrico() {
		return marcadoBiometrico;
	}

	public void setMarcadoBiometrico(boolean marcadoBiometrico) {
		this.marcadoBiometrico = marcadoBiometrico;
	}

	public String getMarcadoHoraDeEntrada() {
		return marcadoHoraDeEntrada;
	}

	public void setMarcadoHoraDeEntrada(String marcadoHoraDeEntrada) {
		this.marcadoHoraDeEntrada = marcadoHoraDeEntrada;
	}

	public String getMarcadoHoraDeSalida() {
		return marcadoHoraDeSalida;
	}

	public void setMarcadoHoraDeSalida(String marcadoHoraDeSalida) {
		this.marcadoHoraDeSalida = marcadoHoraDeSalida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public Object clone() {
		ContratoDocente contrato = new ContratoDocente();
		contrato.setAccesoPlataforma(accesoPlataforma);
		contrato.setApellido(apellido);
		contrato.setCargaHoraria(cargaHoraria);
		contrato.setCursoEducacionSuperior(cursoEducacionSuperior);
		contrato.setMarcadoBiometrico(marcadoBiometrico);
		contrato.setMarcadoHoraDeEntrada(marcadoHoraDeEntrada);
		contrato.setMarcadoHoraDeSalida(marcadoHoraDeSalida);
		contrato.setNombre(nombre);
		contrato.setSueldo(sueldo);
		return contrato;
	}

	public void showInfo() {
		System.out.println("*********************************");
		System.out.println("Acceso a la plataforma: " + accesoPlataforma);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Carga horaria: " + cargaHoraria);
		System.out.println("Curso de educacion superior: " + cursoEducacionSuperior);
		System.out.println("Marcado biometrico: " + marcadoBiometrico);
		System.out.println("Marcado hora de enetrada: " + marcadoHoraDeEntrada);
		System.out.println("Marcado hora de salida: " + marcadoHoraDeSalida);
		System.out.println("Sueldo: " + sueldo);
	}
}
