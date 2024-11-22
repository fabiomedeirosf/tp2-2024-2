package edu.fatec.padroes.mvc.model.business;

import java.util.List;

import edu.fatec.padroes.mvc.model.dto.Produto;
import edu.fatec.padroes.mvc.model.repository.ProdutoRepository;

public class ProdutoBusiness {

	public void salvarProduto(Produto produto) {
		
		if(produto.getQuantidade() <=0 ) {
			System.err.println("Quantidade invalida");
		}
		
		produto.setTotalEstoque(
				produto.getValorUnitario() * produto.getQuantidade());
		
		ProdutoRepository repository = new ProdutoRepository();
		repository.inserirProduto(produto);
	}
	
	public List<Produto> listarProdutos() {
		
		return new ProdutoRepository().consultaProdutos();
	}
}
