package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o salário bruto: ");
		double salario = entrada.nextDouble();
		
		System.out.print("Digite o adicional noturno: ");
		double adicional = entrada.nextDouble();
		
		System.out.print("Digite as horas extras: ");
		double hrExtras = entrada.nextDouble();
		
		System.out.print("Digite o desconto: ");
		double desconto = entrada.nextDouble();
		
		double salarioLiquido = salario + adicional + (hrExtras * 5) - desconto;
		
		System.out.println(" Salário Liquido: " + salarioLiquido);
		
		entrada.close();
	}

}
