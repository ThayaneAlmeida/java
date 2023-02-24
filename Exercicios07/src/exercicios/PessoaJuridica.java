package exercicios;

public class PessoaJuridica extends Ex01_Cliente{

	String cnpj;
	public PessoaJuridica(String nome, String endereco, String dataNasc, String telefone, String cpf, String cnpj) {
		super(nome, endereco, dataNasc, telefone, cpf);
		
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}

}
