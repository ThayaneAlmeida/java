package exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double valorTotal;
		System.out.print("Digite o código do produto: ");
		int codigo = entrada.nextInt();
		
		System.out.print("Digite a quantidade do produto: ");
		int quantidade = entrada.nextInt();
		
		
		switch(codigo) {
		case 1:
			valorTotal = quantidade * 10;
			System.out.println("Produto: X-Salada");
			System.out.println("Valor Total: " + valorTotal);
			break;
			
		case 2:
			valorTotal = quantidade * 15;
			System.out.println("Produto: X-Salada");
			System.out.println("Valor Total: " + valorTotal);
			break;
			
		case 3:
			valorTotal = quantidade * 18;
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor Total: " + valorTotal);
			break;
			
		case 4:
			valorTotal = quantidade * 12;
			System.out.println("Produto: Bauru");
			System.out.println("Valor Total: " + valorTotal);
			break;
			
		case 5:
			valorTotal = quantidade * 8;
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor Total: " + valorTotal);
			break;
			
		case 6:
			valorTotal = quantidade * 13;
			System.out.println("Produto: Suco de Laranja");
			System.out.println("Valor Total: " + valorTotal);
			break;
			
		}
		
		
			
		
		
	}

}
