package edu.fatec.revisao.heranca;

public class ImpostoSP extends Imposto {
	
	@Override
	public Double calcularImposto(Double valorVenda) {
		return valorVenda * 0.18;
	}
}
