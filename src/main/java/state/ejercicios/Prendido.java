package state.ejercicios;

import java.util.Random;

public class Prendido implements IStateComputadora {
	private String[] programasAbiertos = new String [20];

	public Prendido() {
	}

	@Override
	public void handler(Computadora computadora) {
		System.out.println("** Estado: Prendiendo computadora **");
		System.out.println("INFO> prendiendo");
		for (int i = 0; i < programasAbiertos.length; i++) {
			programasAbiertos[i]="programa"+i+1;
		}
		computadora.setProgramasAbiertos(new String[new Random().nextInt(20)]);
		for (int i = 0; i < computadora.getProgramasAbiertos().length; i++) {
			System.out.println("Programa abierto: " + programasAbiertos[i]);
			computadora.getProgramasAbiertos()[i] = programasAbiertos[i];
			
		}
		MemoriaRam mr = new MemoriaRam(computadora.getProgramasAbiertos().length*5);
		CPU cpu = new CPU(computadora.getProgramasAbiertos().length*5, "Prendiendo");
		System.out.println("uso cpu: " + cpu.getPercentageUse() + "%");
		System.out.println("uso memoria ram: " + mr.getPercentageUse() + "%");
		System.out.println("********");
	}

	public String[] getProgramasAbiertos() {
		return programasAbiertos;
	}

	public void setProgramasAbiertos(String[] programasAbiertos) {
		this.programasAbiertos = programasAbiertos;
	}
}
