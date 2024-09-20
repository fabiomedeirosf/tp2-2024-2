package edu.fatec.revisao.financeira.business;

public class EllenBanking extends FinanceiroPadrao {


	@Override
	public void depositar(Conta conta, Double valor) {
		
		Double acrescimo = valor * 0.01;
		acrescimo = (acrescimo > 100D) ? 100D : acrescimo;
		
		conta.alterarSaldo(valor + acrescimo);
		
	}

}
