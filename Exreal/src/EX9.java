import java.util.Scanner;


public class EX9 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		double far = entrada.nextDouble();
		double cel = (far - 32) * 5 / 9;
		
		System.out.print("A temperatura final é de : " + cel + "º");
		
		entrada.close();
	}

}