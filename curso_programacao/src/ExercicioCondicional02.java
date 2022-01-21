import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

public class ExercicioCondicional02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o número para saber se é par ou impar: ");
		int N= sc.nextInt();
		
		if (N%2==0) {
			System.out.println("O número é par!");
		}
		
		else {
			System.out.println("Número é impar!");
		}
		
		
}

}
	