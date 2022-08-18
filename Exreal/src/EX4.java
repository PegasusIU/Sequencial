import java.util.Scanner;


public class EX4 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota : ");
		float numI = entrada.nextFloat();
		System.out.print("Informe a segunda nota : ");
		float numII = entrada.nextFloat();
		System.out.print("Informe a terceira nota : ");
		float numIII = entrada.nextFloat();
		System.out.print("Informe a quarta nota : ");
		float numIV = entrada.nextFloat();
		float media = (numI + numII + numIII + numIV)/4;
		System.out.println("A média das notas é: " + media);
		
		entrada.close();
	}

}
