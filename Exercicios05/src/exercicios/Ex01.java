package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList();
		
		
		for(int i =1; i<=5; i++) {
			System.out.println("Digite a " + i + " cor: ");
			String cor = entrada.nextLine();
			cores.add(cor);
		}
		System.out.println("--------------------");
		System.out.println("Listar as cores: " );
		cores.forEach(System.out::println);
		
		System.out.println("Ordenar as cores: " );
		cores.sort(null);
		cores.forEach(System.out::println);
		
		
		
	}

}
