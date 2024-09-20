package edu.fatec.revisao.financeira.business;

public abstract class FinanceiroPadrao implements FinaceiroInterface {

	@Override
	public void depositar(Conta conta, Double valor) {
		
		conta.alterarSaldo(valor);
	}
	
	@Override
	public void sacar(Conta conta, Double valor) {
		
		if(conta.getSaldo() >= valor) {
			conta.alterarSaldo(-valor);
		} else {
			System.out.println("Conta: " + conta.getNumero() 
				+ " não possui saldo suficiente, saldo: " + conta
				.getSaldo());
		}
	};
}
