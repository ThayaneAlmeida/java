package exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro animal");
		String animal01 = entrada.nextLine();
		
		System.out.println("Digite o segundo animal");
		String animal02 = entrada.nextLine();
		
		System.out.println("Digite o terceiro animal");
		String animal03 = entrada.nextLine();
		
		if(animal01.equalsIgnoreCase("vertebrado")) {
			if(animal02.equalsIgnoreCase("ave")) {
				if(animal03.equalsIgnoreCase("onívoro"))
				 System.out.println("pomba");
				else
				 System.out.println("águia");
		    } else {
				if(animal02.equalsIgnoreCase("herbívoro"))
				 System.out.println("vaca");
				else
				 System.out.println("homem");
			}
			
		} else {
			if(animal02.equalsIgnoreCase("anelídeo")) {
				if(animal03.equalsIgnoreCase("onívoro"))
					System.out.println("minhoca");
				else 
					System.out.println("sanguessuga");
			} else {
				if(animal03.equalsIgnoreCase("hematófago"))
					System.out.println("pulga");
				else 
					System.out.println("lagarta");
				}
			}
	}
}
		
	
	
