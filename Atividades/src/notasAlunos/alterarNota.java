package notasAlunos;
import java.util.Scanner;

public class alterarNota {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Aluno aluno1 = new Aluno ("Bruna", 12113935, 20, 30, 0, "ads", 3);
		System.out.println(aluno1.avaliarAluno());
		System.out.println(aluno1.avaliarRecuperacao());
		aluno1.alteraNotaAE(70);
		System.out.println("Alterar nota da AE");
		System.out.println(aluno1.avaliarAluno());
	}
}
