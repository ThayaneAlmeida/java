package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		String nome;
		int  opcao = 0;
		do {
			System.out.println("-------------------------------");
			System.out.println("1- Adicionar livro na pilha");
			System.out.println("2- Listar todos os livros");
			System.out.println("3- Retirar livro da pilha");
			System.out.println("0- Sair");
			System.out.println("--------------------------------");
			System.out.println("Escolha uma opção: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				entrada.skip("\\R?");
				nome = entrada.nextLine();
				pilha.push(nome);
				System.out.println("Livro adicionado!");
				break;
			
			case 2:
				System.out.println("Listar os livros ");
				pilha.forEach(System.out::println);
				break;
			
			
			case 3:
				if(!pilha.isEmpty()) {
					System.out.println(pilha.pop());
					System.out.println("Um livro foi retirado da pilha!");
				}
				else {
					System.out.println("A pilha está vazia");
				}
				break;
			default:
				System.out.println("Programa finalizado!");
			}
		} while(opcao != 0);
	}

}
