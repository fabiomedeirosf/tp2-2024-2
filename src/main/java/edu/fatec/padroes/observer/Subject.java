package edu.fatec.padroes.observer;

public interface Subject {

	public void register(VendaObserver observer);
	
	public void unRegistre(VendaObserver observer);
	
	public void notifyObservers();
}
