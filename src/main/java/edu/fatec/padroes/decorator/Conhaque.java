package edu.fatec.padroes.decorator;

public class Conhaque extends Bebida {

	public Conhaque() {
		super.descricao = "Conhaque";
	}
	
	@Override
	public Double valor() {
		
		return 9.50;
	}
}
