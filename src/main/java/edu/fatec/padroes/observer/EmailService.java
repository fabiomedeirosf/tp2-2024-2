package edu.fatec.padroes.observer;

public class EmailService implements VendaObserver {

	@Override
	public void atualizarVenda(Venda venda) {
		
		System.out.println("EmailService: enviando email..." 
				+ venda.getCliente());
	}
	
}
