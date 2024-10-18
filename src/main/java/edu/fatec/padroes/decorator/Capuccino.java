package edu.fatec.padroes.decorator;

public class Capuccino extends BlendDecorador {

	private Bebida bebida;
	
	public Capuccino(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao() {
		
		return "capuccino [" + this.bebida.getDescricao() + "]";
	}

	@Override
	public Double valor() {
		
		return this.bebida.valor() + 6.0;
	}

}
