package edu.fatec.revisao.heranca2;

public class PedidoVenda extends Pedido{

	@Override
	public Double calcularComissao() {
		
		return super.valorVenda * 0.05;
	}
}
