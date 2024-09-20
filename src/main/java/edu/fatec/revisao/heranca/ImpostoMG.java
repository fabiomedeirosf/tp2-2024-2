package edu.fatec.revisao.heranca;

public class ImpostoMG extends Imposto {
	
	@Override
	public Double calcularImposto(Double valorVenda) {
	
		if(valorVenda < 500D) {
			return valorVenda * 0.28;
		} else if(valorVenda >= 500 && valorVenda < 5000 ) {
			return valorVenda * 0.26;
		} else if (valorVenda >= 5000 && valorVenda < 10000) {
			return valorVenda * 0.21;
		} else {
			return valorVenda * 0.19;
		}
	}
	
}
