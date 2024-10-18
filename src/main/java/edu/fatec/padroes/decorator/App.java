package edu.fatec.padroes.decorator;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String...strings) {
		
		Bebida expresso = new CafeExpresso();
		Bebida conhaque = new Conhaque();
		
		System.out.println(expresso.getDescricao() 
				+ ": " + expresso.valor());
		
		System.out.println(conhaque.getDescricao() 
				+ ": " + conhaque.valor());
		
		Bebida capuccino = new Capuccino(expresso);
		System.out.println(capuccino.getDescricao() 
				+ ": " + capuccino.valor());
		
		List<Bebida> listaBebidas = new ArrayList<>();
		listaBebidas.add(conhaque);
		listaBebidas.add(expresso);
		
		Bebida mix = new CafeMix(listaBebidas);
		System.out.println(mix.getDescricao() 
				+ ": " + mix.valor());
	}
}
