package edu.fatec.revisao.aula3;

public class Pessoa {

	public String nome;
	
	protected String email;
	
	private String cidade;
	
	
	public Pessoa() {
		System.out.println("Pessoa: construtor padrao");
	}
	
	public Pessoa(String nome) { 
		this.nome = nome;		
	}
	
	protected void teste() {
		System.out.println("Pessoa:teste()");
	}
}
