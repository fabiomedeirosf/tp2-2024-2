package edu.fatec.revisao.aula;

public class Main {

	public static void main(String...strings) {
		
		Aluno a1 = new Aluno("joao");
		a1.ra = "999";
		
		Aluno a2 = new Aluno("joao");
		a2.ra = "999";
		
		Aluno a3 = new Aluno("maria");
		
		if(a1 == a2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		if(a1.equals(a2)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		if(a1.nome.equals(a2.nome) && a1.ra.equals(a2.ra)) { 
			
		}
	}
}
