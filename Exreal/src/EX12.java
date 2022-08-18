import java.util.Scanner;


public class EX12 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a altura: ");
		float h = entrada.nextFloat();
		double pesom = (h * 72.7) - 58;
		double pesof = (h * 62.1) - 44.7;
		
		
		System.out.print("O peso ideal masculino é: " + pesom);
		System.out.print("O peso ideal feminino é: " + pesof);
		
		entrada.close();
	}

}
