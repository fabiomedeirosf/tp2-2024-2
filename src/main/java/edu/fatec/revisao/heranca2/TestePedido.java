package edu.fatec.revisao.heranca2;

public class TestePedido {

	public static void main(String...strings) {
		
		Pedido s = new PedidoServico();
		s.setValorVenda(1000D);
		
		Pedido v = new PedidoVenda();
		v.setValorVenda(2000D);
		
		System.out.println(s.calcularComissao());
		System.out.println(v.calcularComissao());
		
		//System.out.println(calcularComissao(s));
		//System.out.println(calcularComissao(v));	
	}
	
	private static Double calcularComissao(Pedido pedido) {
		
		if(pedido instanceof PedidoServico) {
		
			return pedido.getValorVenda() * 0.11;
			
		} else if (pedido instanceof PedidoVenda) {
			return pedido.getValorVenda() * 0.05;
		}
		
		return 0D;
	}
//	
//	private static Double calcularComissaoVenda(PedidoVenda venda) {
//		
//		return venda.getValorVenda() * 0.05;
//		
//	}
//	
//	private static Double calcularComissaoServico(PedidoServico servico) {
//		
//		return servico.getValorVenda() * 0.11;
//	}
}
