//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

import java.util.Scanner;

public class ExercicioCondicional01 {

public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um n�mero: ");
		int N = sc.nextInt();
		
		
		if (N < 0 ) {
			System.out.println("O n�mero � negativo");
		}
		
		else {
			System.out.println("N�mero n�o � negativo");
		}
}
	
}