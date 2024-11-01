package edu.fatec.padroes.factory;

public abstract class Pizza {
	
	protected Borda borda;

	protected String nome;
	
	public Pizza(Borda borda) {
		this.borda = borda;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Borda getBorda() {
		return borda;
	}

}
