package CalculosDiversos;

import java.util.Scanner;

public class Cedulas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*	int N, cem, cinq, vint, dez, cinc, dois, um;
		
		N = sc.nextInt();
								         										
		cem = N / 100;
		cinq = (N % 100) / 50;
		vint = ((N % 100) % 50) / 20;
		dez = (((N % 100) % 50) % 20) / 10;
		cinc = ((((N % 100) % 50) % 20) % 10) / 5;
		dois = (((((N % 100) % 50) % 20) % 10) % 5) / 2;
		um = (((((N % 100) % 50) % 20) % 10) % 5) % 2;
		
		System.out.println(N);
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinq + " nota(s) de R$ 50,00");
		System.out.println(vint + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinc + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00"); */
		
		int N, quociente, resto, nota;
		
		N = sc.nextInt();
		resto = N;
		
		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 5;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$" + nota + ",00");
		resto = resto % nota;
		
		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto % nota;
		
		nota = 1;
		quociente = resto;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		
		sc.close();
	}
}
