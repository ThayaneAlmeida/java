package exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Set <Integer> numeros = new HashSet <Integer>();
		
		for (int i = 1; i<=10; i++) {
			System.out.println("Digite o " + i + " valor: ");
		int num = entrada.nextInt();
		numeros.add(num);
		}
		
		System.out.println("Listar os números: ");
		
		Iterator<Integer> inumeros = numeros.iterator();
		
		while(inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}
	}

}
