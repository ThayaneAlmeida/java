package exercicios;

public class Ex05_Ingresso {
	private String nomeFilme;
	private String horarioSessao;
	private int sala;
	private String genero;
	private double valor;
	public Ex05_Ingresso(String nomeFilme, String horarioSessao, int sala, String genero, double valor) {
		this.nomeFilme = nomeFilme;
		this.horarioSessao = horarioSessao;
		this.sala = sala;
		this.genero = genero;
		this.valor = valor;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public String getHorarioSessao() {
		return horarioSessao;
	}
	public void setHorarioSessao(String horarioSessao) {
		this.horarioSessao = horarioSessao;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void visualizar() {
		System.out.print("----------------------------------------");
		System.out.print("---------- DADOS DO INGRESSO -----------");
		System.out.print("----------------------------------------");
		System.out.print("Nome do Filme: " + this.nomeFilme);
		System.out.print("Genêro: " + this.genero);
		System.out.print("Horário Sessão: " + this.horarioSessao);
		System.out.print("Sala: " + this.sala);
		System.out.print("Valor do Ingresso: " + this.valor);
		System.out.print("-----------------------------------------");
	}
	
}
