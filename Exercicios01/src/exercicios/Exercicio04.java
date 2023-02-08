package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		float num1 = entrada.nextFloat();
		
		System.out.print("Digite o segundo valor: ");
		float num2 = entrada.nextFloat();
		
		System.out.print("Digite o terceiro valor: ");
		float num3 = entrada.nextFloat();
		
		System.out.print("Digite o quarto valor: ");
		float num4 = entrada.nextFloat();
		
		float calculo = (num1 * num2) - (num3 * num4);
		
		System.out.println("Diferença: " + calculo);
		
		entrada.close();
	}

}
