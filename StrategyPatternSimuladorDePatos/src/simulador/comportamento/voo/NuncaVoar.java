package simulador.comportamento.voo;

public class NuncaVoar implements ComportamentoVoo {
	
	@Override
	public void Voar() {
		System.out.println("N�o pode Voar");
	}

}
