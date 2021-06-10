package state.ejercicios;

public class Computadora {

	private IStateComputadora state;
	private CPU cpu;
	private MemoriaRam memoriaRam;
	private String[] programasAbiertos;

	public IStateComputadora getState() {
		return state;
	}

	public void setState(IStateComputadora state) {
		this.state = state;
	}

	public void request() {
		this.state.handler(this);
	}

	public CPU getCPU() {
		return cpu;
	}

	public void setCPU(CPU cpu) {
		this.cpu = cpu;
	}

	public MemoriaRam getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(MemoriaRam memoriaRam) {
		this.memoriaRam = memoriaRam;
	}


	public String[] getProgramasAbiertos() {
		return programasAbiertos;
	}

	public void setProgramasAbiertos(String[] programasAbiertos) {
		this.programasAbiertos = programasAbiertos;
	}
}
