package simulador.patos;

import simulador.comportamento.som.EmitirSomAlto;
import simulador.comportamento.voo.VoarComAsas;

public class PatoBravo extends Pato {
	
	public PatoBravo() {
		this.setComportamentoVoo(new VoarComAsas());
		this.setComportamentoSom(new EmitirSomAlto());
	}
	
	public void exibir() {
		System.out.println("Mostrando Pato Bravo");
	}

}
