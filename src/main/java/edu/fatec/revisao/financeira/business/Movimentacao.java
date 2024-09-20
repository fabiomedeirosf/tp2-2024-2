package edu.fatec.revisao.financeira.business;

import java.util.Date;

public class Movimentacao {

	private Date data;
	
	private String operacao;
	
	private Double valor;
	
	private Double saldo;
	
	public Movimentacao() {};
	
	public Movimentacao(Date data, String operacao, Double valor, Double saldo) {
		this.data = data;
		this.operacao = operacao;
		this.valor = valor;
		this.saldo = saldo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
