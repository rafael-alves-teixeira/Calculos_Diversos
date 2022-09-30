package CalculosDiversos;
import java.util.Locale;
import java.util.Scanner;

public class Tempo_De_Duracao_2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt(); 
		int horaFinal = sc.nextInt();	
		int minutoFinal = sc.nextInt();
		
		int M1, M2, Minutos, totMinutos, totHoras;
	
		M1 = horaInicial * 60 + minutoInicial;
		M2 = horaFinal * 60 + minutoFinal;
		
		if (M1 < M2) {
			Minutos = M2 - M1;
		}                                                    // 24horas = 1440min
		else if (M1 == M2) {
			Minutos = 1440;
		}
		else { 
			Minutos = 1440 - M1 + M2;
		}
		
		totHoras = Minutos / 60;
		totMinutos = Minutos % 60;
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", totHoras, totMinutos);
			
		sc.close();
	}
}
