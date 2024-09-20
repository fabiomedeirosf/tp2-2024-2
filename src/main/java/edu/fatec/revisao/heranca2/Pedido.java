package edu.fatec.revisao.heranca2;

public abstract class Pedido implements Comissao {

	protected Double valorVenda;
	
	protected String cliente;
	

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
}
