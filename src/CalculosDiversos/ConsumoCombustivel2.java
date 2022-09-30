package CalculosDiversos;

import java.util.Locale;
import java.util.Scanner;

public class ConsumoCombustivel2 {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hrs, vel, km;
		double litros;
		
		hrs = sc.nextInt();
		vel = sc.nextInt();
		km = vel * hrs;
		litros = (double)km / 12;
		
		System.out.printf("%.3f%n", litros);
		 	
		sc.close();
	}
}
