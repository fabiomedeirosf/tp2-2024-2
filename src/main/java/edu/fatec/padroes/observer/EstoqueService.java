package edu.fatec.padroes.observer;

public class EstoqueService implements VendaObserver {

	@Override
	public void atualizarVenda(Venda venda) {
		
		this.atualizarEstoque(venda);
		
	}
	
	private void atualizarEstoque(Venda venda) {
		
		System.out.println("Baixa estoque..."
				+ venda.getCodigo());
	}
}
