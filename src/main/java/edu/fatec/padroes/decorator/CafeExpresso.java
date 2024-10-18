package edu.fatec.padroes.decorator;

public class CafeExpresso extends Bebida {

	public CafeExpresso() {
		super.descricao = "cafe expresso";
	}
	
	@Override
	public Double valor() {
		
		return 5.0;
	}

}
