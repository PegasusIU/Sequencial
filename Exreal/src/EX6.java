import java.util.Scanner;


public class EX6 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a medida do raio: ");
		double raio = entrada.nextDouble();
		double area = (raio * raio) * 3.14;
		
		System.out.print("A medida da area é: " + area);
		entrada.close();
	}

}