package exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pares = 0;
		int impares = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		for(int cont = 1; cont <= 10; cont++) {

			System.out.print("Digite o " + cont + "º número: ");
			int num = entrada.nextInt();
			
			if(num % 2 == 0) {
				pares += 1;
			}
			else if(num % 2 != 0) {
				impares += 1;
			}
		}
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números impares: " + impares);
		
		entrada.close();
	}

}
