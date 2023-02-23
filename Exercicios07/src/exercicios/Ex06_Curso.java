package exercicios;

public class Ex06_Curso {
	private int codigoCurso;
	private String nomeCurso;
	private String horarioAula;
	private String dataInicio;
	private double valor;
	public Ex06_Curso(int codigoCurso, String nomeCurso, String horarioAula, String dataInicio, double valor) {
		
		this.codigoCurso = codigoCurso;
		this.nomeCurso = nomeCurso;
		this.horarioAula = horarioAula;
		this.dataInicio = dataInicio;
		this.valor = valor;
	}
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getHorarioAula() {
		return horarioAula;
	}
	public void setHorarioAula(String horarioAula) {
		this.horarioAula = horarioAula;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		System.out.print("--------------------------------");
		System.out.print("-------- DADOS DO CURSO --------");
		System.out.print("--------------------------------");
		System.out.print("Id do Curso: " + this.codigoCurso);
		System.out.print("Nome do Curso: " + this.nomeCurso);
		System.out.print("Valor do Curso: " + this.valor);
		System.out.print("Horario das Aulas: " + this.horarioAula);
		System.out.print("Data de Início: " + this.dataInicio);
	}
}
