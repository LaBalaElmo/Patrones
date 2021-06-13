package strategy.ejercicio;

import java.util.ArrayList;

public class PrecioRopa {
	private ArrayList<Ropa> ropaList;
	private IVentas ventas;

	public PrecioRopa() {
	}

	public ArrayList<Ropa> getRopaList() {
		return ropaList;
	}

	public void setRopaList(ArrayList<Ropa> ropaList) {
		this.ropaList = ropaList;
	}

	public IVentas getVentas() {
		return ventas;
	}

	public void setVentas(IVentas ventas) {
		this.ventas = ventas;
	}

	public void execute() {
		this.ventas.eVenta(ropaList);
	}
}
