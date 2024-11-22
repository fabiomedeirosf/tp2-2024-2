package edu.fatec.padroes.mvc.controller;

import java.util.List;

import edu.fatec.padroes.mvc.model.business.ProdutoBusiness;
import edu.fatec.padroes.mvc.model.dto.Produto;

public class ProdutoController {

	public void cadastrarProduto(String descricao, Integer quantidade, Double valor) {
		
		Produto novoProduto = new Produto();
		
		novoProduto.setDescricao(descricao);
		novoProduto.setQuantidade(quantidade);
		novoProduto.setValorUnitario(valor);
		
		ProdutoBusiness business = new ProdutoBusiness();
		business.salvarProduto(novoProduto);
	}
	
	public List<Produto> listarProdutos() {
		return new ProdutoBusiness().listarProdutos();
	}
}
