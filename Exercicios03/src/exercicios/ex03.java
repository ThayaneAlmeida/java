package exercicios;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		int idade = entrada.nextInt();
		int vinteUm = 0;
		int cinquenta = 0;

		while(idade > 0) {
			if(idade < 21) {
				vinteUm +=1;
			}
			else if (idade > 50) {
				cinquenta +=1;
			}
		System.out.print("Digite a idade: ");
		idade = entrada.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos: " + vinteUm);
		System.out.println("Total de pessoas maiores de 50 anos: " + cinquenta);
		
		entrada.close();
	}

}
