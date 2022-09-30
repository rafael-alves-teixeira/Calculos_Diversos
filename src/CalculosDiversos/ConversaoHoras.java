package CalculosDiversos;


import java.util.Scanner;

public class ConversaoHoras {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h, m, s, segundos;
		segundos = sc.nextInt();
																
		h = (segundos / 60) / 60;
		m = (segundos / 60) % 60;
		s = segundos % 60;	
		
		System.out.printf("%d:%d:%d%n", h, m, s);
		
		sc.close();
	}
}
