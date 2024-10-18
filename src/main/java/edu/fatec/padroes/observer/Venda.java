package edu.fatec.padroes.observer;

public class Venda {

	private Integer codigo;
	
	private String cliente;
	
	private Double total;
	
	public Venda() {};
	
	public Venda(Integer codigo, String cliente, Double total) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.total = total;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
}
