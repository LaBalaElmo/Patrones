package ejercciosPrimerParcial.builder;

public class Plato {
	private String tipoCarne;
	private String saborRefresco;
	private String guarnicion;

	public String getTipoCarne() {
		return tipoCarne;
	}

	public void setTipoCarne(String tipoCarne) {
		this.tipoCarne = tipoCarne;
	}

	public String getSaborRefresco() {
		return saborRefresco;
	}

	public void setSaborRefresco(String saborRefresco) {
		this.saborRefresco = saborRefresco;
	}

	public String getGuarnicion() {
		return guarnicion;
	}

	public void setGuarnicion(String guarnicion) {
		this.guarnicion = guarnicion;
	}

	public void showData() {
		System.out.println("Tipo de carne: " + tipoCarne);
		System.out.println("Sabor de refresco: " + saborRefresco);
		System.out.println("Guarnicion: " + guarnicion);
	}
}
