package CalculosDiversos;
import java.util.Scanner;

public class CalculoDeMultiplicacao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int A = sc.nextInt();
		int B = sc.nextInt();
		int PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
		
	}
}
