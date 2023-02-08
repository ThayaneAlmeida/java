package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o salario: ");
		float salario = entrada.nextFloat();
		
		System.out.print("Digite o abono: ");
		float abono = entrada.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.println("Novo Salario: " + novoSalario);
		
		entrada.close();
	}

}
