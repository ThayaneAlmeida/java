package exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int num, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			num = entrada.nextInt();
			
			if(num > 0) {
				soma += num;
			}
		}
		while(num != 0);
		System.out.println("A soma dos números positivos é: " + soma);
		
		entrada.close();
		}
		
	}

