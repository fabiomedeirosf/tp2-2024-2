package edu.fatec.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class VendaSubject implements Subject {

	private List<VendaObserver> observers = new ArrayList<VendaObserver>();
	
	private Venda venda;
	
	@Override
	public void register(VendaObserver observer) {
		
		this.observers.add(observer);		
	}

	@Override
	public void unRegistre(VendaObserver observer) {
		
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		
		for(VendaObserver observer : this.observers) {
			observer.atualizarVenda(this.venda);
		}
	}
	
	public void setVenda(Venda venda) {
		this.venda = venda;
		
		this.notifyObservers();
	}

}
