package abstractFactory.ejercicios.heladeria;

public class FactoryHelado {
	public static enum typeHelado {
		HELADO_AGUA, HELADO_CREMA, HELADO_MIXTO
	}

	public static IHelado make(typeHelado type) {
		IHelado helado;
		switch (type) {
		case HELADO_AGUA:
			helado = new HeladoAgua();
			((HeladoAgua) helado).setBase(new Base("cono", "grande", "galleta", "5"));
			((HeladoAgua) helado).setForma("clasica");
			((HeladoAgua) helado).setFruta(new Fruta("dulces", "frutilla", "1", "mediano"));
			((HeladoAgua) helado).setTamano("mediano");
			break;
		case HELADO_CREMA:
			helado = new HeladoCrema();
			((HeladoCrema) helado).setBase(new Base("cono", "grande", "galleta", "5"));
			((HeladoCrema) helado).setCrema(new Crema("naranja", "1", "PIL"));
			((HeladoCrema) helado).setForma("clasica");
			((HeladoCrema) helado).setFruta(new Fruta("dulces", "frutilla", "1", "mediano"));
			((HeladoCrema) helado).setTamano("mediano");
			break;
		case HELADO_MIXTO:
			helado = new HeladoMixto();
			((HeladoMixto) helado).setBase(new Base("vaso", "mediano", "plastico", "6"));
			((HeladoMixto) helado).setCosto("50");
			((HeladoMixto) helado).setCrema(new Crema("vainilla", "1", "PIL"));
			((HeladoMixto) helado).setForma("standart");
			((HeladoMixto) helado).setFruta(new Fruta("acido", "chirimolla", "1", "mediano"));
			((HeladoMixto) helado).setTamano("mediano");
			break;
		default:
			helado = null;
			System.out.println("Pasaje no disponible");
		}
		return helado;
	}
}
