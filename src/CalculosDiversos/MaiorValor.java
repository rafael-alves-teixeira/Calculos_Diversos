package CalculosDiversos;

import java.util.Locale;
import java.util.Scanner;

public class MaiorValor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, x, maior;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		x = (a + b + Math.abs(a - b)) / 2;
		maior = (c + x + Math.abs(c - x)) / 2;

		System.out.printf("%d eh o maior%n", maior);			
		sc.close();
	}
}
