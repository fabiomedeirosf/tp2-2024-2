package edu.fatec.revisao.heranca;

public class ImpostoRJ extends Imposto {

	@Override
	public Double calcularImposto(Double valorVenda) {
		
		return valorVenda * 0.215;
	}
}
