import java.util.Scanner;


public class EX10 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número (Int): ");
		int num1 = entrada.nextInt();
		System.out.print("Informe o segundo número (Int): ");
		int num2 = entrada.nextInt();
		System.out.print("Informe o número real: ");
		float num3 = entrada.nextFloat();
		
		float con1 = (num1 * 2) * (num2 / 2f);
		float con2 = (num1 * 3) + num3;
		float con3 = (num1 * num3) * num3;
		
		System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + con1);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + con2);
		System.out.println("O terceiro ao quadrado é : " + con3);
		
		entrada.close();
	}

}