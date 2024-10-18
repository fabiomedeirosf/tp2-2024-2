package edu.fatec.padroes.decorator;

public abstract class Bebida {

	protected String descricao;
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public abstract Double valor();
}
