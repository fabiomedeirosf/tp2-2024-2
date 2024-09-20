package edu.fatec.revisao.financeira.business;

public class FrancaBanking extends FinanceiroPadrao {
	
	private static final Double LIMITE = 1000.0;
	
	
	@Override
	public void sacar(Conta conta, Double valor) {
		
		if((conta.getSaldo() + LIMITE) >= valor) {
			
			conta.alterarSaldo(-valor);
		} else {
			System.err.println("Saldo insuficiente");
		}
		
	}
}
