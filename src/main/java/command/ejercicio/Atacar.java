package command.ejercicio;

public class Atacar implements  IAcciones {
    private Juego juego;

    public Atacar(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("Ejecutando accion.....");
        this.juego.atacar();
    }
}