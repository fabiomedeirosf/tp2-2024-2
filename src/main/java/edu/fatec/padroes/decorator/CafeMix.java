package edu.fatec.padroes.decorator;

import java.util.ArrayList;
import java.util.List;

public class CafeMix extends BlendDecorador{

	private List<Bebida> bebidas = new ArrayList<Bebida>();
	
	public CafeMix(List<Bebida> bebidas) {
		this.bebidas = bebidas;
	}
	
	public CafeMix(Bebida bebida) {
		this.bebidas.add(bebida);
	}
	
	@Override
	public Double valor() {
		Double custo = 10.0;
		for(Bebida b : this.bebidas) {
			custo += b.valor();
		}
		return custo;
	}
	
	@Override
	public String getDescricao() {
		String rotulo = "CafeMix [";
		for(Bebida b : this.bebidas) {
			rotulo += b.getDescricao() + ",";
		}
		rotulo += "]";
		return rotulo;
	}

	

}
