package edu.fatec.revisao.aula;

public class Ex1 {

	public static final String FATEC = "fatec franca dr. thomaz novelino";
	
	public static void main(String[] strings ) {
		
		int valor = -1;
		
		valor = (valor < 0) ? 0 : valor;
		
		if(valor < 0) {
			valor = 0;
		} else {
			valor = valor;
		}
		
		
		Pedido p = new Pedido(1234);
		
		p.listaProdutos.add(new Produto(1, "TV", 2500.99));
		p.listaProdutos.add(new Produto(2, "ps5", 4500.55));
		
		p.cliente = "joao da silva";
		p.cidade = "franca";
			
		
		
		Pedido p2 = new Pedido(124);
		p2.listaProdutos.add(new Produto(99, "microondas", 400.55));
		p2.listaProdutos.add(new Produto(944, "fogao", 250.44));
		p2.listaProdutos.add(new Produto(554, "perfuminho", 699.55));
		p2.cliente = "maria";
		p2.cidade = "mococa";
		
		System.out.println(p.cidade);
		System.out.println(p2.cidade);
		Pedido.cidade = "capetinga";
		
		if(p.equals(p2)) {
			System.out.println("pedidos iguais");
		} else {
			System.out.println("pedidos diferntes");
		}
		
		
	}
}
