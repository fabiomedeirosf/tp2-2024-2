package edu.fatec.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class VendasRepository implements VendaObserver{

	private static List<Venda> listaVendas = new ArrayList<Venda>();
	
	@Override
	public void atualizarVenda(Venda venda) {
		
		listaVendas.add(venda);
		
	}
	
	public Double getTotalVendas() {
		
		Double total = 0D;
		
		for(Venda v: listaVendas) {
			total += v.getTotal();
		}
		return total;
	}
}
