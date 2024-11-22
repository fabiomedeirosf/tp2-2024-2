package edu.fatec.padroes.mvc.model.dto;

public class Produto {

	private Integer codigo;
	
	private String descricao;
	
	private Integer quantidade;
	
	private Double valorUnitario;
	
	private Double totalEstoque;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public Double getTotalEstoque() {
		return totalEstoque;
	}
	
	public void setTotalEstoque(Double totalEstoque) {
		this.totalEstoque = totalEstoque;
	}
	
}
