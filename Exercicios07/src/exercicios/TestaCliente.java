package exercicios;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01_Cliente clienteAna = new Ex01_Cliente("Ana Maria", "Rua Um","01/01/2001","(11)99999-9999", "000.000.000-00");
		clienteAna.visualizar();
		
		Ex01_Cliente clienteJoao = new Ex01_Cliente("João Paulo", "Rua Dois","02/02/2002","(11)88888-8888", "111.000.000-11");
		clienteJoao.visualizar();
		}

}
