package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do doador: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite a idade do doador: ");
		int idade = entrada.nextInt();
		
		System.out.print("É a sua primeira doação? ");
		boolean priDoacao = entrada.nextBoolean();
		
			if(idade >= 60 && idade <= 69) {
				if(priDoacao) 
					System.out.println(nome + "  não está apto(a) para doar");
				
				else 
					System.out.println(nome + " está apto(a) para doar");
				}
			else if(idade >= 18 && idade <= 69) 
			System.out.println(nome + " está apto(a) para doar");
			else {
			System.out.println(nome + " não está apto(a) para doar");
		}
	
	}

}
