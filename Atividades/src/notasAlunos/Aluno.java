package notasAlunos;

public class Aluno {
	private String nome;
	private Integer matricula;
	private Double notaAV1;
	private Double notaAV2;
	private Double notaAE;
	private String curso;
	private Integer periodo;

	public Aluno(String nome, Integer matricula, String curso, Integer periodo) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	public Double getNotaAV1() {
		return notaAV1;
	}
	public void setNotaAV1(Double notaAV1) {
		this.notaAV1 = notaAV1;
	}
	public Double getNotaAV2() {
		return notaAV2;
	}
	public void setNotaAV2(Double notaAV2) {
		this.notaAV2 = notaAV2;
	}
	public Double getNotaAE() {
		return notaAE;
	}
	public void setNotaAE(Double notaAE) {
		this.notaAE = notaAE;
	}
	
	
	public String avaliarAluno(Double notaAV1, Double notaAV2) {
		Double 	soma = notaAV1 + notaAV2; 
	
	if (soma >= 60) 
		return "Aprovado";
	else 
		return "Reprovado";
	}
	public String avaliarRecuperacao(Double notaAV1, Double notaAV2, Double notaAE) {
		Double avaliacao = (notaAV1 + notaAV2 + notaAE) / 3;
	
	if (avaliacao >= 60)
		return "Aprovado";
	else 
		return "Reprovado";
		
	}
	
	
}

	