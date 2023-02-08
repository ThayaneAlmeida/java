package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		float nota3 = entrada.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		float nota4 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Média final: " + media);
		
		entrada.close();
	}

}
