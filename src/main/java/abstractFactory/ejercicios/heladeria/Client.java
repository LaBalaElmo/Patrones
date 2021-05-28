package abstractFactory.ejercicios.heladeria;

public class Client {
    public  static void main (String[]args){
    	HeladoAgua helado1 = (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
    	helado1.setTamano("pequeño");
    	helado1.crear();
    	HeladoAgua helado2 = (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
    	helado2.setTamano("mediano");
    	helado2.crear();
    	HeladoAgua helado3 = (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
    	helado3.setTamano("grande");
    	helado3.crear();
    	HeladoCrema helado4 = (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
    	helado4.setTamano("pequeño");
    	helado4.crear();
    	HeladoCrema helado5 = (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
    	helado5.setTamano("mediano");
    	helado5.crear();
    	HeladoCrema helado6 = (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
    	helado6.setTamano("grande");
    	helado6.crear();
    	HeladoMixto helado7 = (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
    	helado7.setTamano("pequeño");
    	helado7.crear();
    	HeladoMixto helado8 = (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
    	helado8.setTamano("mediano");
    	helado8.crear();
    	HeladoMixto helado9 = (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
    	helado9.setTamano("grande");
    	helado9.crear();
    }
}
