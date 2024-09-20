package edu.fatec.revisao.heranca;

public class ImpostBA extends Imposto{

	@Override
	public Double calcularImposto(Double valorVenda) {
		
		Double impostoGeral = super.calcularImposto(valorVenda);
		
		if(valorVenda <= 10000) {
			return impostoGeral - (impostoGeral * 0.06);
		} else {
			return impostoGeral * 1.025;
		}
		
	}
}
