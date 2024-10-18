package edu.fatec.revisao.financeira.business;

public class DaniloBanking extends FinanceiroPadrao 
			implements EmprestimoInterface, CapitalizacaoInterface{

	@Override
	public Double emprestar(Conta conta, Double valor) {
		
		Double limiteEmprestimo = conta.getSaldo() * 0.5;
		
		if(valor <= limiteEmprestimo) {
			conta.setEmprestimo(valor);
		} else {
			conta.setEmprestimo(limiteEmprestimo);
		}
		
		return conta.getEmprestimo();
	}

	@Override
	public void amortizar(Conta conta, Double valor) {
		
		conta.setEmprestimo(conta.getEmprestimo() - valor);
		
	}

	@Override
	public void investir(Double valor) {
		System.out.println("fique rico investindo e nao ganhando");
		
	}
	

}
