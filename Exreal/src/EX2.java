import java.util.Scanner;


public class EX2 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número (int): ");
		int numI = entrada.nextInt();
		System.out.println("O número informado foi: " + numI);
		
		entrada.close();

	}

}
