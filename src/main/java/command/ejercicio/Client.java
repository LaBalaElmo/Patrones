package command.ejercicio;

public class Client {
	public static void main(String[] args) {
		Juego csgo = new Juego("CS GO", 2.25);

        Atacar atacar= new Atacar(csgo);
        Defensa defensa = new Defensa(csgo);
        Disparar disparar = new Disparar(csgo);


        Invoker comandosEspecificos= new Invoker();
        comandosEspecificos.addCommand(atacar);
        comandosEspecificos.addCommand(defensa);
        comandosEspecificos.addCommand(atacar);
        comandosEspecificos.addCommand(disparar);
        comandosEspecificos.addCommand(defensa);
        comandosEspecificos.addCommand(disparar);

        comandosEspecificos.executeCommands();
	}

}
