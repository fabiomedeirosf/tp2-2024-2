package edu.fatec.revisao.financeira.business;

public class BankingAPP {

	public static void main(String...strings) {
		
		FinaceiroInterface financeira = new DaniloBanking();
		
		Conta c1 = new Conta(123, 50D);
		
		financeira.depositar(c1, 20D);
		System.out.println(c1.getSaldo());
		
		financeira.sacar(c1, 42.90);
		System.out.println(c1.getSaldo());
		
		financeira.sacar(c1, 90D);
		financeira.sacar(c1, 16.34D);

		System.out.println(c1.getSaldo());
		
		System.out.println("---------------------");
		FinaceiroInterface ellenBank = new EllenBanking();
		Conta c2 = new Conta(333, 100D);
		
		ellenBank.depositar(c2, 100D);
		System.out.println(c2.getSaldo());
		ellenBank.depositar(c2, 20000D);
		
		System.out.println(c2.getSaldo());
		
		c1.imprimirExtrato();
		
	}
}
