package CalculosDiversos;

import java.util.Locale;
import java.util.Scanner;

public class MinutosDistancia {
	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		int distancia, minutos;
		
		distancia = sc.nextInt();
		minutos = distancia * 2;
		
		System.out.println(minutos + " minutos");
			
		sc.close();
	}
}
