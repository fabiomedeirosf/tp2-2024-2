package edu.fatec.revisao.financeira.business;

public class BankingAPP {

	public static void main(String...strings) {
		
		
		FinaceiroInterface f = new DaniloBanking();
		
		
		
		
		
		FinaceiroInterface financeira = new DaniloBanking();
		
		Conta c1 = new Conta(123, 50D);
		
		financeira.depositar(c1, 20D);
		System.out.println(c1.getSaldo());
		
		financeira.sacar(c1, 42.90);
		System.out.println(c1.getSaldo());
		
		financeira.sacar(c1, 90D);
		financeira.sacar(c1, 16.34D);
		financeira.depositar(c1, 6000D);
		
		EmprestimoInterface daniloEmprestimo = new DaniloBanking();
		
		c1.imprimirExtrato();
		
		System.out.println("emprestimo realizado: " + 
				daniloEmprestimo.emprestar(c1, 1000D));
		
		
	}
}
