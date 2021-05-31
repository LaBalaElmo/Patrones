package ejercciosPrimerParcial.singleton;

public class VentanillaDePago {
	private static VentanillaDePago instancia;
	private static int monto = 1000;
	private static String pass = "12345678";
	private static boolean validacion;

	private VentanillaDePago() {
		if (validacion) {
			System.out.println("Ingreso exitoso al sistema, contraseña correcta");
		} else {
			System.out.println("El sistema no se inicio, contraseña incorrecta");
		}
	}

	public static VentanillaDePago getInstance(String password) {
		if (instancia == null && pass.equals(password)) {
			validacion = true;
			instancia = new VentanillaDePago();
		}
		return instancia;
	}

	public static VentanillaDePago getInstance() {
		return instancia;
	}

	public int getMonto() {
		return monto;
	}

	public static void cobrar(int dinero) {
		monto = monto + dinero;
	}
}
