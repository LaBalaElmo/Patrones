package builder.ejercicios;

import java.util.ArrayList;

public class Pizza {
	private ArrayList<String> ingredientes;
	private String tipoMasa;
	private String tipoQueso;

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getTipoMasa() {
		return tipoMasa;
	}

	public void setTipoMasa(String tipoMasa) {
		this.tipoMasa = tipoMasa;
	}

	public String getTipoQueso() {
		return tipoQueso;
	}

	public void setTipoQueso(String tipoQueso) {
		this.tipoQueso = tipoQueso;
	}

	public void showData() {
		System.out.print("Los ingredientes son: " + ingredientes.get(0));
		for (int i = 1; i < ingredientes.size(); i++) {
			System.out.print(", " + ingredientes.get(i));
		}
		System.out.println();
		System.out.println("Tipo de masa: " + tipoMasa);
		System.out.println("Tipo de queso: " + tipoQueso);
	}
}
