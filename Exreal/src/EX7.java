import java.util.Scanner;


public class EX7 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a medida do lado do quadrado: ");
		double lado = entrada.nextDouble();
		double area = lado * lado;
		
		System.out.print("A medida da area é: " + area);
		entrada.close();
	}

}