package CalculosDiversos;

import java.util.Scanner;

public class ConversaoDiaMesAno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N, anos, meses, dias, resto;
		
		N = sc.nextInt();
		
		anos = N / 365;
		resto = N % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		
		
		/* !!! Esta opção é mais viável quando há a necessidade de fazer muitas conversões!!!
		 * 
		 * int idade, resto, anos, meses, dias;
		
		idade = sc.nextInt();
		resto = idade;
		
		anos = resto / 365;
		System.out.println(anos + " ano(s)");
		resto = resto % 365;
		
		meses = resto / 30;
		System.out.println(meses + " mes(es)");
		resto = resto % 30;
		
		dias = resto;
		System.out.println(dias + " dia(s)");  */
		
		sc.close();
	}
}
