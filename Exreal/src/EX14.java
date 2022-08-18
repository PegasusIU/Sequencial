import java.util.Scanner;


public class EX14 {

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ganho por hora: ");
		float ganho = entrada.nextFloat();
		System.out.print("Informe número de horas no mês: ");
		float horas = entrada.nextFloat();
		
		float salbruto = ganho * horas;
		System.out.println("O salário bruto foi de: " + salbruto);
		
		double inss = salbruto * 0.08;
		System.out.println("O pagamento para o INSS foi de: " + inss);
		
		double sindicato = salbruto * 0.05;
		System.out.println("O pagamento para o sindicato foi de: " + sindicato);
		
		double salliq = salbruto - (salbruto * 0.11) - (salbruto * 0.08)- (salbruto * 0.05);
		System.out.println("O pagamento do salário líquido foi de: " + salliq);
		
		
		entrada.close();
	}

}