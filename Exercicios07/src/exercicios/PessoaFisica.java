package exercicios;

public class PessoaFisica extends Ex01_Cliente{

	private String rg;
	
	public PessoaFisica(String nome, String endereco, String dataNasc, String telefone, String cpf, String rg) {
		super(nome, endereco, dataNasc, telefone, cpf);
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("RG: " + this.rg);
	}
	
}
