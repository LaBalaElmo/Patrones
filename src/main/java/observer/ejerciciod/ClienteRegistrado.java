package observer.ejerciciod;

public class ClienteRegistrado implements ICliente {

    private String categoria;
    private Persona persona;
    
    public ClienteRegistrado(Persona persona, String categoria) {
        this.persona=persona;
        this.categoria=categoria;
    }

    @Override
    public void update(String message, String notificacion) {
        System.out.println("********* NOTIFY *********");
        System.out.println(message);
        persona.info();
        System.out.println("INFO > " + notificacion);
    }

    @Override
    public String getCategoria() {
        return this.categoria;
    }
}
