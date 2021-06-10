package state.ejercicios;

import java.util.Random;

public class Apagado implements IStateComputadora {

    public Apagado(){

    }


    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Apagado **");
        computadora.setCPU(new CPU(new Random().nextInt(10),"apagado"));
        computadora.setMemoriaRam(new MemoriaRam(new Random().nextInt(10)));
        computadora.setProgramasAbiertos(new String[0]);
        System.out.println("%cpu: "+computadora.getCPU().getPercentageUse());
        System.out.println("%meoria: "+computadora.getMemoriaRam().getPercentageUse());
        System.out.println("Programas abiertos: " + computadora.getProgramasAbiertos().length);
        System.out.println("********");
    }
}
