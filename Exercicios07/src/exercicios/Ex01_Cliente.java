package exercicios;

public class Ex01_Cliente {
	
	private String nome;
	private String endereco; 
	private String dataNasc;
	private String telefone;
	private String cpf;
	
	public Ex01_Cliente(String nome, String endereco, String dataNasc, String telefone, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		System.out.println("\n\n----------------------------------------------");
		System.out.println("----------- DADOS DO CLIENTE -----------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data de nascimento: " + this.dataNasc);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("----------------------------------------------");
	}
	
	

}
