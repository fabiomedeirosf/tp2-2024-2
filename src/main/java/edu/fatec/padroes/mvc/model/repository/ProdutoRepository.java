package edu.fatec.padroes.mvc.model.repository;

import java.util.ArrayList;
import java.util.List;

import edu.fatec.padroes.mvc.model.dto.Produto;

public class ProdutoRepository {

	private static final List<Produto> listaProdutosInMemory = 
			new ArrayList<Produto>();

			
	public Produto inserirProduto(Produto produto) {
		
		Integer codigo = (int) (Math.random() *1000);
		
		produto.setCodigo(codigo);
		
		listaProdutosInMemory.add(produto);
		
		return produto;
	}
	
	public List<Produto> consultaProdutos() {
		return listaProdutosInMemory;
	}
	
}
