package edu.fatec.revisao.financeira.business;

public interface EmprestimoInterface {

	public Double emprestar(Conta conta, Double valor);
	
	public void amortizar(Conta conta, Double valor);
}
