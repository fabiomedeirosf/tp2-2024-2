package edu.fatec.revisao.aula;

import java.util.Objects;

public class Produto {

	Integer codigo;
	
	String descricao;
	
	Double valor;
	
 	
	/**
	 * Construtor sobrecarregado
	 * @param codigo
	 * @param descricao
	 * @param valor
	 */
	public Produto(Integer codigo, String descricao, Double valor) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
}
