package exercicios;

public class Ex02_Funcionario {
	private String nome;
	private String endereco;
	private String dataAdmissao;
	private Double salario;
	private String funcao;
	
	public Ex02_Funcionario(String nome, String endereco, String dataAdmissao, Double salario, String funcao) {

		this.nome = nome;
		this.endereco = endereco;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		this.funcao = funcao;
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

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void visualizar() {
		System.out.print("------------------------------------------");
		System.out.print("----------- DADOS DO FUNCIONÁRIO ---------");
		System.out.print("------------------------------------------");
		System.out.print("Nome: " + this.nome);
		System.out.print("Endereço: " + this.endereco);
		System.out.print("Função: " + this.funcao);
		System.out.print("Salário: " + this.salario);
		System.out.print("Data de Admissão: " + this.dataAdmissao);
		System.out.print("------------------------------------------");
	}
	
	
	
}
