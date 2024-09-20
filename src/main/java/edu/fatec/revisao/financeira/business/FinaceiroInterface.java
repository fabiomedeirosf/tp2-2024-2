package edu.fatec.revisao.financeira.business;

public interface FinaceiroInterface {

	public abstract void sacar(Conta conta, Double valor);
	
	public void depositar(Conta conta, Double valor);
}
