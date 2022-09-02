package notasAlunos;

public class Aluno {
	private String nome;
	private Integer matricula;
	private float notaAV1;
	private float notaAV2;
	private float notaAE;
	private String curso;
	private Integer periodo;

	//Ctrl +3 >>> gcuf cria construtor automatico 
	public Aluno(String nome, Integer matricula, float notaAV1, float notaAV2, float notaAE, String curso,
			Integer periodo) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	public void alteraNotaAV1 (float nota)
	{
		this.notaAV1 = nota;
	}
	
	public void alteraNotaAV2 (float nota)
	{
		this.notaAV2 = nota;
	}
	
	public void alteraNotaAE (float nota)
	{
		this.notaAE = nota;
	}
	
	public String avaliarAluno () {
	if ((this.notaAV1 + this.notaAV2)>=60)
		return "Aprovado";
	else 
		return "Recuperação";
	}
	
	
	public String avaliarRecuperacao() {
	if ((this.notaAV1 + this.notaAV2 + this.notaAE)/2 >= 60)
		return "Aprovado";
	else 
		return "Reprovado";	
	}


}
