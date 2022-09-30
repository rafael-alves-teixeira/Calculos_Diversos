package CalculosDiversos;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, media;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		media = (2 * a + 3 * b + 5 * c) / 10.0; // Foi utilizada a média ponderada
		
		System.out.printf("MEDIA = %.1f%n", media);		
		
		sc.close();
	}
}
