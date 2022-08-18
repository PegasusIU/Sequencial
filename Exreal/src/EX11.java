import java.util.Scanner;


public class EX11 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a altura: ");
		double h = entrada.nextDouble();
		double peso = (h * 72.7) - 58;
		
		System.out.print("O peso ideal é: " + peso);
		
		entrada.close();
	}

}
