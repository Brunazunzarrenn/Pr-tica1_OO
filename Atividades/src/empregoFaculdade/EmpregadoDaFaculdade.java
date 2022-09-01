package empregoFaculdade;

public class EmpregadoDaFaculdade {
	
	private String nome;
	private double salario;
	private int horasAula;
	
	double getGastos() {
		return this.salario + 40*horasAula;
	}
	
	String getInfo() {
		return "nome: "+ this.nome + " salario: " + this.salario + String.format("%.2f",(this.salario + 40*horasAula));
	}
	public void setNome(String nome) {
		this.nome = nome; 
	}
	public double getSalario(double salario){
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getHorasAula(int horasAula) {
		return horasAula; 
	}
	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}
	public String getNome(){
		return nome;
	}
}