import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar

public class ExercicioCondicional02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o n�mero para saber se � par ou impar: ");
		int N= sc.nextInt();
		
		if (N%2==0) {
			System.out.println("O n�mero � par!");
		}
		
		else {
			System.out.println("N�mero � impar!");
		}
		
		
}

}
	