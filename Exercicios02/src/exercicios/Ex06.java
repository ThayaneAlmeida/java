package exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do colaborador: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o código do colaborador: ");
		int codigo = entrada.nextInt();
		
		System.out.print("Digite o salário do colaborador: ");
		float salario = entrada.nextFloat();
		
		double novoSalario;
		
		switch(codigo) {
		case 1:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: " + (salario + (salario * 0.10)));
			break;
			
		case 2:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário: " + (salario + (salario * 0.07)));
			break;
			
		case 3:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: " + (salario + (salario * 0.09)));
			break;
			
		case 4:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: " + (salario + (salario * 0.06)));
			break;
		case 5:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário: " + (salario + (salario * 0.05)));
			break;
		case 6:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário: " + (salario + (salario * 0.08)));
			break;
			
		}

	}

}
