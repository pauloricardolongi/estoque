package acao;

import java.util.Locale;

import java.util.Scanner;


import objetos.Produto;



public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto  p = new Produto();
		
		System.out.println("Entre com os dados do Produto: ");
		System.out.print("Nome do Produto: ");
		String nome= sc.nextLine();
		System.out.print("Digite o valor do Preço do Produto: ");
		double preco= sc.nextDouble();
		
			
		Produto produto = new Produto (nome, preco);
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto);
		System.out.println();
		System.out.print("Digite o número de Produtos que serão adicionados no Estoque: ");
	    int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		System.out.println();
		System.out.println("Atualizar Dados do Produto: " + produto);
		System.out.println();
		System.out.print("Entre com o número que precisa ser removido do Estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		System.out.println();
		System.out.println("Dados atualizados "+ produto);
		
		sc.close();



	}

}
