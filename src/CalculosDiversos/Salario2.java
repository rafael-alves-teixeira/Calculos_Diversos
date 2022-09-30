package CalculosDiversos;
import java.util.Locale;
import java.util.Scanner;

public class Salario2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome; 
		double salario, vendas, pagamento;
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		pagamento = salario + vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", pagamento);		
		
		
		sc.close();
	}
}
