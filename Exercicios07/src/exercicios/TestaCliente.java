package exercicios;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01_Cliente clienteAna = new Ex01_Cliente("Ana Maria", "Rua Um","01/01/2001","(11)99999-9999", "000.000.000-00");
		clienteAna.visualizar();
		
		Ex01_Cliente clienteJoao = new Ex01_Cliente("João Paulo", "Rua Dois","02/02/2002","(11)88888-8888", "111.000.000-11");
		clienteJoao.visualizar();
		
		
		PessoaFisica pf1 = new PessoaFisica("Pedro", "Rua Três", "03/03/2003", "(11)11111-1111", "222.222.222-22", "33.333.333-3");
		pf1.visualizar();
		
		PessoaFisica pf2 = new PessoaFisica("Janaina", "Rua Quatro", "04/04/2004", "(41)44444-1111", "444.444.444-44", "33.444.333-4");
		pf2.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica("Julio", "Rua Cinco", "05/05/1995", "(55)44444-5555", "555.444.555-55", "55.555.000/0001-01");
		pj1.visualizar();
		
		PessoaJuridica pj2 = new PessoaJuridica("Marcia", "Rua Seis", "06/06/1996", "(66)44444-6666", "555.666.666-66", "00.666.000/0001-06");
		pj2.visualizar();
		}
}
