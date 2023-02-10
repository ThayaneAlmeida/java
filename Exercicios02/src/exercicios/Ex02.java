package exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		
		if((num % 2 == 0) && num > 0) {
			System.out.println("O número " + num + " é par e positivo");
		}
		
		else if((num % 2 != 0) && num < 0) {
			System.out.println("O número " + num + " é ímpar e negativo");
		}
		
		else if((num % 2 == 0) && num < 0) {
			System.out.println("O número " + num + " é par e negativo");
		}
		
		else if((num % 2 != 0) && num > 0) {
			System.out.println("O número " + num + " é ímpar e positivo");
		}
		
		entrada.close();
	}

}
