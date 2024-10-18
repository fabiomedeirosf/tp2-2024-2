package edu.fatec.padroes.observer;

public class App {

	public static void main(String...strings) {
		
		VendaSubject subject = new VendaSubject();
		
		VendasRepository repository = new VendasRepository();
		subject.register(repository);
		
		EmailService email = new EmailService();
		subject.register(email);
		
		EstoqueService estoque = new EstoqueService();
		subject.register(estoque);
		
		WhatsAPPService zap = new WhatsAPPService();
		subject.register(zap);
		
		Venda v1 = new Venda(111, "joao", 1599.99);
		Venda v2 = new Venda(222, "maria", 2000.99);
		
		subject.setVenda(v1);
		subject.setVenda(v2);
		
		System.out.println("Total vendas: " +repository.getTotalVendas());
		
	}
}
