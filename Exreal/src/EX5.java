import java.util.Scanner;


public class EX5 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a medida em metros: ");
		float met = entrada.nextFloat();
		float cent = met * 100;
		
		System.out.print("A medida em centímetros é: " + cent);
		entrada.close();
	}

}