package exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("DIgite o número A: ");
		int numA = entrada.nextInt();
		
		System.out.print("DIgite o número B: ");
		int numB = entrada.nextInt();
		
		System.out.print("DIgite o número C: ");
		int numC = entrada.nextInt();
		
		if((numA + numB) > numC) {
			System.out.println(numA + " + " + numB + " = " + (numA + numB) + " > " + numC + "\n" +
			"A Soma de A + B é maior do que C");
		}
		else if((numA + numB) < numC) {
			System.out.println(numA + " + " + numB + " = " + (numA + numB) + " < " + numC + "\n" +
					"A Soma de A + B é menor do que C");
		}
		else if((numA + numB) == numC) {
			System.out.println(numA + " + " + numB + " = " + (numA + numB) + " = " + numC + "\n" +
					"A Soma de A + B é igual a C");
		}
		
		entrada.close();
	}
}
