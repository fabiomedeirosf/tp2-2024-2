package edu.fatec.revisao.heranca2;

public class PedidoServico extends Pedido {

	private Integer quantidadePessoas;

	@Override
	public Double calcularComissao() {
		
		return super.valorVenda * 0.11;
	}
	
	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	
	
}
