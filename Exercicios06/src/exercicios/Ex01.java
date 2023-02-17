package exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		String nome;
		int  opcao = 0;
		do {
			System.out.println("-------------------------------");
			System.out.println("1- Adicionar cliente na fila");
			System.out.println("2- Listar todos os clientes");
			System.out.println("3- Retirar um cliente da fila");
			System.out.println("0- Sair");
			System.out.println("--------------------------------");
			System.out.println("Escolha uma opção: ");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				entrada.skip("\\R?");
				nome = entrada.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado!");
				break;
			
			case 2:
				System.out.println("Listar os clientes ");
				fila.forEach(System.out::println);
				break;
			
			
			case 3:
				if(!fila.isEmpty()) {
					System.out.println(fila.poll());
					System.out.println("O Cliente foi chamado!");
				}
				else {
					System.out.println("A fila está vazia");
				}
				break;
			default:
				System.out.println("Programa finalizado!");
			}	
			
		}
		while(opcao != 0);
	}

}
