import java.util.Scanner;


public class EX3 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número (int): ");
		int numI = entrada.nextInt();
		System.out.print("Informe o segundo número (int): ");
		int numII = entrada.nextInt();
		int soma = numI + numII;
		System.out.println("A soma dos números é: " + soma);
		
		entrada.close();
	}

}
