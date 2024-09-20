package edu.fatec.revisao.financeira.business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {

	private Integer numero;
	
	private Double saldo;
	
	private List<String> extrato = new ArrayList<>();
	
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
		
		StringBuilder registro = new StringBuilder();
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy: HH:mm");
		registro
			.append(df.format(new Date()))
			.append("\t")
			.append((valor > 0) ? "depos" : "saque")
			.append("\t\t")
			.append(valor)
			.append("\t")
			.append(this.saldo);
		
		this.extrato.add(registro.toString());
	}
	
	public void imprimirExtrato() {
		
		System.out.println("Data\t\t\tOperacao\tValor\tSaldo");
		
		this.extrato.forEach(registro -> {
			System.out.println(registro);
		});
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	
}
