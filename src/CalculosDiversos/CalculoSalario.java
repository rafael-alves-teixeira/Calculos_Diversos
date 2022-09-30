package CalculosDiversos;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	double hs_trabalhadas = sc.nextDouble();
	double valor_hora = sc.nextDouble();
	double salario = hs_trabalhadas * valor_hora;
	
	System.out.println("NUMBER = " + num);
	System.out.printf("SALARY = U$ %.2f%n", salario);
	

	
	sc.close();	
	}
}
