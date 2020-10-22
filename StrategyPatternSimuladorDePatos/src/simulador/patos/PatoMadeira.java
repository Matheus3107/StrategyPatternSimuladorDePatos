package simulador.patos;

import simulador.comportamento.som.EmitirSomArtificial;
import simulador.comportamento.voo.NuncaVoar;

public class PatoMadeira extends Pato {
	
	public PatoMadeira() {
		this.setComportamentoVoo(new NuncaVoar());
		this.setComportamentoSom(new EmitirSomArtificial());
	}
	public void exibir() {
		System.out.println("Mostrando Pato de Madeira");
	}
}
