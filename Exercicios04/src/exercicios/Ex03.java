package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int somaPrincipal = 0, somaSecundaria = 0;
		int[] vetorSoma = new int[3];
		int[][] vetor = new int [3][3];
		
		for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
                vetor[linha][coluna] = entrada.nextInt();
            }
         }
		for(int linha = 0; linha < vetor.length; linha++) {
			for(int coluna = 0; coluna < vetor.length; coluna++) {
				if(linha == coluna) {

				}
			}
        }
		for(int linha = 0; linha < vetor.length; linha++) {
			for(int coluna = 0; coluna < vetor.length; coluna++) {
				if(linha + coluna == vetor.length -1) {
					somaSecundaria += vetor[linha][coluna];
				}
			}
		}
		System.out.println("Soma diagonal principal: " + somaPrincipal);
		System.out.println("Soma diagonal secundária: " + somaSecundaria);
	}
}

