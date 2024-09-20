package edu.fatec.revisao.financeira.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {

	private Integer numero;
	
	private Double saldo;
	
	private Double emprestimo;
	
	private List<Movimentacao> extrato = new ArrayList<>();
	
	public Conta(Integer numero, Double saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
		this.gerarExtrato(saldo);

	}
	
	public Double alterarSaldo(Double valor) {
		
		this.saldo += valor;
		
		this.gerarExtrato(valor);
		
		return this.saldo;
	}

	
	private void gerarExtrato(Double valor) {
		
		Movimentacao novaMovimentacao = new Movimentacao();
		novaMovimentacao.setData(new Date());
		novaMovimentacao.setOperacao((valor > 0) ? "DEPOS" : "SAQUE");
		novaMovimentacao.setValor(valor);
		novaMovimentacao.setSaldo(this.saldo);
		
		this.extrato.add(novaMovimentacao);
	}
	
	public void imprimirExtrato() {
		
		System.out.println("Data\t\t\tOperacao\tValor\tSaldo");
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm");
		
		this.extrato.forEach(registro -> {
			System.out.printf("\n%s", df.format(registro.getData()));
			System.out.printf("\t%s", registro.getOperacao());
			System.out.printf("\t\t%.2f", registro.getValor());
			System.out.printf("\t%.2f", registro.getSaldo());
		});
		System.out.println("\n-------------------------------");
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void setEmprestimo(Double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public Double getEmprestimo() {
		return emprestimo;
	}
	
}
