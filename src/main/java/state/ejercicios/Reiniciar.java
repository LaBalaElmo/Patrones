package state.ejercicios;

public class Reiniciar implements IStateComputadora {

    public Reiniciar(){
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Reiniciando computadora **");
        System.out.println("INFO> action: Reiniciando");
        MemoriaRam memoriaRam = new MemoriaRam(0);
        computadora.setMemoriaRam(memoriaRam);
        computadora.setCPU(new CPU(0, "Reiniciar"));
        System.out.println("INFO> memoria ram: "+ memoriaRam.getPercentageUse());
        System.out.println("INFO> cpu: "+ computadora.getCPU().getPercentageUse());
        System.out.println("INFO> cerrando todos los programas");
        computadora.setProgramasAbiertos(new String[0]);
        System.out.println("INFO> programas abiertos: "+ computadora.getProgramasAbiertos().length);
        System.out.println("********");
    }
}
