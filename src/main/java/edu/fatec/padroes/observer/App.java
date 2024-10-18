package edu.fatec.padroes.observer;

public class App {

	public static void main(String...strings) {
		
		VendaSubject subject = new VendaSubject();
		
		EmailService email = new EmailService();
		subject.register(email);
		
		EstoqueService estoque = new EstoqueService();
		subject.register(estoque);
		
		WhatsAPPService zap = new WhatsAPPService();
		subject.register(zap);
		
		Venda v1 = new Venda(111, "joao", 1599.99);
		
		subject.setVenda(v1);
		//subject.unRegistre(email);
		
		//v1.setTotal(2999.99);
		//subject.setVenda(v1);
		
	}
}
