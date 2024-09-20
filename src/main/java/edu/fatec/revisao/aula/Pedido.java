package edu.fatec.revisao.aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {

	Integer codigo;
	
	String cliente;
	
	static String cidade;
	
	List<Produto> listaProdutos = new ArrayList<Produto>();
	
	/**
	 * Construtor sobrecarregado
	 * @param codigo
	 */
	public Pedido(Integer codigo) {
		this.codigo = codigo;
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
		Pedido other = (Pedido) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
	
}
