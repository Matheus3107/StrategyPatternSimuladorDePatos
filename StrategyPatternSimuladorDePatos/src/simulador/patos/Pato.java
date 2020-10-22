package simulador.patos;

import simulador.comportamento.som.ComportamentoSom;
import simulador.comportamento.voo.ComportamentoVoo;

public class Pato {

	private ComportamentoSom comportamentoSom;
	private ComportamentoVoo comportamentoVoo;
	
	public void voar() {
		this.comportamentoVoo.Voar();
	}
	public void emitirSom() {
		this.comportamentoSom.emitirSom();
	}
	
	public ComportamentoSom getComportamentoSom() {
		return comportamentoSom;
	}
	public void setComportamentoSom(ComportamentoSom comportamentoSom) {
		this.comportamentoSom = comportamentoSom;
	}
	public ComportamentoVoo getComportamentoVoo() {
		return comportamentoVoo;
	}
	public void setComportamentoVoo(ComportamentoVoo comportamentoVoo) {
		this.comportamentoVoo = comportamentoVoo;
	}
	
	
	
	
	
}
