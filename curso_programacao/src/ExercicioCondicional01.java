//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class ExercicioCondicional01 {

public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um número: ");
		int N = sc.nextInt();
		
		
		if (N < 0 ) {
			System.out.println("O número é negativo");
		}
		
		else {
			System.out.println("Número não é negativo");
		}
}
	
}