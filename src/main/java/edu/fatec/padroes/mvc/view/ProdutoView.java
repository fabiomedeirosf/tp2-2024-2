package edu.fatec.padroes.mvc.view;

import java.util.List;
import java.util.Scanner;

import edu.fatec.padroes.mvc.controller.ProdutoController;
import edu.fatec.padroes.mvc.model.dto.Produto;

public class ProdutoView {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String...strings) {
		
		formProduto();	
	}
	
	private static void formProduto() {
		 System.out.println("#### Cadastro de Produtinhos ####");
		 
		 int opcao = -1;
		 
		 while(opcao != 0) {
			 System.out.println(" -> Indique opção:");
			 System.out.println("1 - cadastrar");
			 System.out.println("2 - listar");
			 System.out.println("0 - Tchauzinho");
			 
			 opcao = scanner.nextInt();
			 
			 switch(opcao) {
			 case 1:
				 telaCadastroProduto();
				 break;
				 
			 case 2:
				 telaListarProduto();
				 break;
			 }
		 }
	}
	
	private static void telaCadastroProduto() {
		
		System.out.println(" .:: Cadastro de Produto ::. ");
		System.out.println("Descricao: ");
		String descricao = scanner.next();
		
		System.out.println("Quantidade: ");
		Integer quantidade = scanner.nextInt();
		
		System.out.println("Valor: ");
		Double valor = scanner.nextDouble();
		
		ProdutoController controller = new ProdutoController();
		controller.cadastrarProduto(descricao, quantidade, valor);
	}
	
	private static void telaListarProduto() {
		ProdutoController controller = new ProdutoController();
		List<Produto> listaProdutos = controller.listarProdutos();
		
		System.out.println("###### listagem de produtos #########");
		listaProdutos.forEach(produto -> {
			System.out.println("codigo: " + produto.getCodigo());
			System.out.println("Descricao: " + produto.getDescricao());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Valor Unitario: " + produto.getValorUnitario());
			System.out.println("Total estoque: " + produto.getTotalEstoque());
		});
	}
	
	
}
