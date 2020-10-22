package Play;

import simulador.patos.PatoBravo;
import simulador.patos.PatoCabecaVermelha;
import simulador.patos.PatoMadeira;

public class Play {

	public static void main(String[] args) {
		
		System.out.println("===============================");
		PatoBravo pb = new PatoBravo();
		pb.exibir();
		pb.emitirSom();
		pb.voar();
		
		System.out.println("===============================");
		PatoCabecaVermelha pc = new PatoCabecaVermelha();
		pc.exibir();
		pc.emitirSom();
		pc.voar();
		
		System.out.println("===============================");
		PatoMadeira pm = new PatoMadeira();
		pm.exibir();
		pm.emitirSom();
		pm.voar();
		System.out.println("===============================");
	}

}
