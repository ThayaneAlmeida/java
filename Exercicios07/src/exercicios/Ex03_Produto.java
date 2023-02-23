package exercicios;

public class Ex03_Produto {
	private int idProduto;
	private String nomeProduto;
	private double valor;
	private int quantidade;
	private String marca;
	
	public Ex03_Produto(int idProduto, String nomeProduto, double valor, int quantidade, String marca) {

		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.marca = marca;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public void visualizar() {
		System.out.println("\n\n---------------------------------------");
		System.out.println("----------- DADOS DO PRODUTO ----------");
		System.out.println("---------------------------------------");
		System.out.println("Id Produto: " + this.idProduto);
		System.out.println("Nome do produto: " + this.nomeProduto);
		System.out.println("Marca: " + this.marca);
		System.out.println("Valor: " + this.valor);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("---------------------------------------");
	}
	
	
}


