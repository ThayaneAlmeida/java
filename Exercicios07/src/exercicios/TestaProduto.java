package exercicios;

public class TestaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03_Produto produtoUm = new Ex03_Produto(1, "TV - 32 Polegadas", 1500.00, 2, "LG");
		produtoUm.visualizar();
		
		Ex03_Produto produtoDois = new Ex03_Produto(2, "Batedeira", 200.00, 3, "Britânia");
		produtoDois.visualizar();
	}

}
