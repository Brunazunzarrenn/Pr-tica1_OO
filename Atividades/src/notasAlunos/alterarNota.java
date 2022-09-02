package notasAlunos;
import java.util.Scanner;

public class alterarNota {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Aluno aluno1 = new Aluno ("Bruna", 12113935, 40, 30, 0, "ads", 3);
		System.out.println(aluno1.avaliarAluno());
	}
}
