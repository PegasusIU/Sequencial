import java.util.Scanner;


public class EX13 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o peso: ");
		float peso = entrada.nextFloat();
		float multa = 0;
		float excesso = 0;
		if (peso > 50) {
			excesso = (peso - 50); 
			multa = (excesso) * 4;
			System.out.print("O valor do excesso é: " + excesso);
			System.out.print("O valor da multa é: " + multa);
		} else {
			System.out.print("O valor da multa é: Zero");
		}
		
		
		
		entrada.close();
	}

}