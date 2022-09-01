package empregoFaculdade;
import java.util.Scanner;

public class faculdade {
	

	public class Faculdade {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);	 
			
			EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade();
			
			System.out.println("Digite seu nome: ");
			empregado.setNome(ler.next());
			
			System.out.println("Digite seu salario: ");
			empregado.setSalario(ler.nextDouble());
					
			System.out.println("Digite suas horas aulas: ");
			empregado.setHorasAula(ler.nextInt());

			System.out.printf("O salario com o bonus é: %.2f", empregado.getGastos());
			System.out.println();
			System.out.println(empregado.getInfo());
			
			ler.close();

		}

	}
}
