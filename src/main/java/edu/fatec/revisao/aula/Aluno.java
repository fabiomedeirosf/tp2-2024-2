package edu.fatec.revisao.aula;

import java.util.Objects;

public class Aluno {

	String nome;
	
	String ra;
	
	/**
	 * Construtor default sobrescrito
	 */
	public Aluno() {
		System.out.println("construtor padrao");
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, ra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(ra, other.ra);
	}
	
	
	
	
	
	
}
