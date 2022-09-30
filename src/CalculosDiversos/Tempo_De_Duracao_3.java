package CalculosDiversos;
import java.util.Locale;
import java.util.Scanner;

public class Tempo_De_Duracao_3 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
		String s;

		s = sc.next();
		W1 = sc.nextInt();
		X1 = sc.nextInt();
		s = sc.next();
		Y1 = sc.nextInt();
		s = sc.next();
		Z1 = sc.nextInt();
		s = sc.next();
		W2 = sc.nextInt();
		X2 = sc.nextInt();
		s = sc.next();
		Y2 = sc.nextInt();
		s = sc.next();
		Z2 = sc.nextInt();
		
		inicio = W1*24*60*60 + X1*60*60 + Y1*60 + Z1;
		fim = W2*24*60*60 + X2*60*60 + Y2*60 + Z2;
		duracao = fim - inicio;
		
		W = duracao / (24*60*60);
		resto = duracao % (24*60*60);
		X = resto / (60*60);
		resto = resto % (60*60);
		Y = resto / 60;
		Z = resto % 60;
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");		
		
		sc.close();
	}
}
		
/*
		int dia, hora, min, seg, totsegundos, totsegA, totsegB, resto;
		
		dia = sc.nextInt();
		System.out.println("DIA " + dia);
		hora = sc.nextInt();
		min = sc.nextInt();
		seg = sc.nextInt();
		System.out.println(hora + ":" + min + ":" + seg);

		totsegA = (((dia * 24 + hora) * 60 + min) * 60 + seg);
		
		dia = sc.nextInt();
		System.out.println("DIA " + dia);
		hora = sc.nextInt();
		min = sc.nextInt();
		seg = sc.nextInt();
		System.out.println(hora + ":" + min + ":" + seg);

		
		totsegB = (((dia * 24 + hora) * 60 + min) * 60 + seg);
		
		totsegundos = Math.abs(totsegA - totsegB);
		
		resto = totsegundos;                   // 24hs = 86.400s |  1h = 3600s | 1min = 60s
		
		dia = resto / 86400;
		resto = resto % 86400;
		
		hora = resto / 3600;
		resto = resto % 3600;
		
		min = resto / 60;
		resto = resto % 60;
		
		seg = resto / 1;
		
		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(min + " minuto(s)");
		System.out.println(seg + " segundo(s)");

		
		sc.close();
	}
} */
