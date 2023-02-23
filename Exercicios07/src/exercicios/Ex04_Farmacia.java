package exercicios;

public class Ex04_Farmacia {
	private int idRemedio;
	private String nomeRemedio;
	private int quantidade;
	private double valor;
	private String tipoRemedio;
	public Ex04_Farmacia(int idRemedio, String nomeRemedio, int quantidade, double valor, String tipoRemedio) {

		this.idRemedio = idRemedio;
		this.nomeRemedio = nomeRemedio;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipoRemedio = tipoRemedio;
	}
	public int getIdRemedio() {
		return idRemedio;
	}
	public void setIdRemedio(int idRemedio) {
		this.idRemedio = idRemedio;
	}
	public String getNomeRemedio() {
		return nomeRemedio;
	}
	public void setNomeRemedio(String nomeRemedio) {
		this.nomeRemedio = nomeRemedio;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipoRemedio() {
		return tipoRemedio;
	}
	public void setTipoRemedio(String tipoRemedio) {
		this.tipoRemedio = tipoRemedio;
	}
	
	public void visualizar() {
		System.out.print("-----------------------------------");
		System.out.print("--------- DADOS DO REMÉDIO --------");
		System.out.print("-----------------------------------");
		System.out.print("ID do Remédio: " + this.idRemedio);
		System.out.print("Nome do Produto: " + this.nomeRemedio);
		System.out.print("Tipo Remédio: " + this.tipoRemedio);
		System.out.print("Valor: " + this.valor);
		System.out.print("Quantidade: " + this.quantidade);
		System.out.print("-----------------------------------");
	}
	
}
