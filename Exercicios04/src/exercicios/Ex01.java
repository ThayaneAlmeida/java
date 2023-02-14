package exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número que quer encontrar: ");
		int numero = entrada.nextInt();
		boolean encontrou = false;
		int indice = 0;
		int vetor[] = {2,9,7,6,1,4,10,3,5,8};
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == numero) {
				encontrou = true;
				indice = i;
			}
		}
		if(encontrou) {
			System.out.println("O número " + numero + " está localizado na posição: " + indice);
		}
		else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		entrada.close();
	}

}
