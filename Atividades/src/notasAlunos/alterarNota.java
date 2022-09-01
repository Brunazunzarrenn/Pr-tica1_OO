package notasAlunos;
import java.util.Scanner;

public class alterarNota {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			
			System.out.println("Digite seu nome: ");
			String nome = ler.next();
			System.out.println("Digite sua matricula: ");
			int matricula = ler.nextInt();
			System.out.println("Digite seu curso: ");
			String curso = ler.next();
			System.out.println("Digite seu periodo: ");
			int periodo = ler.nextInt();
			
			Aluno aluno = new Aluno(nome,matricula,curso,periodo);
			
			System.out.println("Digite a nota da AV1: ");
			aluno.setNotaAV1(ler.nextDouble());
			System.out.println("Digite a nota da AV2: ");
			aluno.setNotaAV2(ler.nextDouble());
			
			String resultado = aluno.avaliarAluno(aluno.getNotaAV1(),aluno.getNotaAV2());
			System.out.println("Você foi "+resultado);
			
			if (resultado.equals("Recuperacao")) {
				System.out.println("Digite a nota da AE: ");
				aluno.setNotaAE(ler.nextDouble());
				resultado = aluno.avaliarRecuperacao(aluno.getNotaAV1(), aluno.getNotaAV2(), aluno.getNotaAE());
				System.out.println("Você foi "+resultado);
			}
			
			ler.close();
		}

		
	}

