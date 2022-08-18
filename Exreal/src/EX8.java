import java.util.Scanner;


public class EX8 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ganho por hora: ");
		double ganho = entrada.nextDouble();
		System.out.print("Informe o número de horas trabalhadas: ");
		double hora = entrada.nextDouble();
		double salario = ganho * hora;
		
		System.out.print("O total do salário é de: " + salario);
		
		entrada.close();
	}

}