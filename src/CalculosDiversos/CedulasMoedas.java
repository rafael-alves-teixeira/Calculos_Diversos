package CalculosDiversos;

import java.util.Locale;
import java.util.Scanner;

public class CedulasMoedas {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N;
		int quociente, resto, nota, moeda;
		
		N = sc.nextDouble();
		
		
		resto = (int) (N * 100.0 + 0.5);

		System.out.println("NOTAS:");


		nota = 100;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 50;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 20;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 10;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 5;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 2;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

	    System.out.println("MOEDAS:");

		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
	    resto = resto % moeda;

		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
	    resto = resto % moeda;

		moeda = 25;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.25");
	    resto = resto % moeda;

		moeda = 10;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.10");
	    resto = resto % moeda;

		moeda = 5;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.05");
	    resto = resto % moeda;

		System.out.println(resto + " moeda(s) de R$ 0.01");
	    
		sc.close();
	}
} 

 /*
  *  double quociente, moeda, nota, resto, valor;
 
  valor = sc.nextDouble();
  resto = valor;
  
    System.out.println("NOTAS:");

  nota = 100;
  quociente = resto / nota;
  System.out.printf("%d nota(s) de R$ %.2f%n", (int)quociente, nota);
  resto = resto % nota;
  
  nota = 50.0;
  quociente = resto / nota;
  System.out.printf("%d nota(s) de R$ %.2f%n", (int)quociente, nota);
  resto = resto % nota;
  
  nota = 20.0;
  quociente = resto / nota;
  System.out.printf("%d nota(s) de R$ %.2f%n", (int) quociente, nota);
  resto = resto % nota;
  
  nota = 10.0;
  quociente = resto / nota;
  System.out.printf("%d nota(s) de R$ %.2f%n", (int) quociente, nota);
  resto = resto % nota;
  
  nota = 5.0;
  quociente = resto / nota;
  System.out.printf("%d nota(s) de R$ %.2f%n", (int) quociente, nota);
  resto = resto % nota;
  
  nota = 2.0;
  quociente = resto / nota;
  System.out.printf("%d nota(s) de R$ %.2f%n", (int) quociente, nota);
  resto = resto % nota;
  
    System.out.println("MOEDAS:");

  moeda = 1.0;
  quociente = resto / moeda;
  System.out.printf("%d moeda(s) de R$ %.2f%n", (int) quociente, moeda);
  resto = resto % moeda;
  
  moeda = 0.5;
  quociente = resto / moeda;
  System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
  resto = resto % moeda;
  
  moeda = 0.25;
  quociente = resto / moeda;
  System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
  resto = resto % moeda;
  
  moeda = 0.10;
  quociente = resto / moeda;
  System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
  resto = resto % moeda;
  
  moeda = 0.05;
  quociente = resto / moeda;
  System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
  resto = resto % moeda;
  
  moeda = 0.01;
  quociente = resto / moeda;
  System.out.printf("%d moeda(s) de R$ %.2f%n", (int)quociente, moeda);
  
sc.close();
}
} */
