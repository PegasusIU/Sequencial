
import java.util.Scanner;


public class EX16 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho em metros quadrados: ");
		float area = entrada.nextFloat();
		
		float cobertura = area / 6;
		float latas = cobertura / 18;
		double galao = cobertura / 3.6;
		
		System.out.println("Vao ser necessarias " + latas + " latas de tinta");
		System.out.println("O custo total em latas será de : " + (latas * 80) );
		System.out.println("Vao ser necessarias " + galao + " galoes de tinta");
		System.out.println("O custo total será de : " + (galao * 25) );
		
		entrada.close();
	}

}