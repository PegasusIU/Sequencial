
import java.util.Scanner;


public class EX15 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho em metros quadrados: ");
		float area = entrada.nextFloat();
		
		float cobertura = area / 3;
		float latas = cobertura / 18;
		
		System.out.println("Vao ser necessarias " + latas + " latas de tinta");
		System.out.println("O custo total será de : " + (latas * 80) );
		
		entrada.close();
	}

}