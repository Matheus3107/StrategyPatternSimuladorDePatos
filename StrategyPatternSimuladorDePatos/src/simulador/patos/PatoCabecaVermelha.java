package simulador.patos;

import simulador.comportamento.som.EmitirSomCaracteristico;
import simulador.comportamento.voo.VoarComAsas;

public class PatoCabecaVermelha extends Pato{
	public PatoCabecaVermelha() {
		this.setComportamentoVoo(new VoarComAsas());
		this.setComportamentoSom(new EmitirSomCaracteristico());
	}
	
	public void exibir() {
		System.out.println("Mostrando Pato Cabeça Vermelha");
	}
}
