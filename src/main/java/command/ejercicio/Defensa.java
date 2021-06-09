package command.ejercicio;

public class Defensa implements  IAcciones {
    private Juego juego;

    public Defensa(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("Ejecutando accion.....");
        this.juego.defender();
    }
}