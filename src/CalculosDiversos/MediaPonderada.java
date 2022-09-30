package CalculosDiversos;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		media = (3.5 * nota1 + 7.5 * nota2) / 11; //usa-se o cálculo de média ponderada
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
	}
}
