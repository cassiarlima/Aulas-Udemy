import java.util.Locale;
import java.util.Scanner;

/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */
public class ExercicioCondicional06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe um número: ");
		double N = sc.nextInt();
		
		if (N < 0 || N > 100) {
			System.out.println("Fora do intervalo");
		}
		
		else if (N <= 25 ) {
			System.out.println("Intervalo (0,25)");
		}
		
		else if (N <= 50) {
			System.out.println("Intervalo (25,50)");
		}
		
		else if (N <= 75) {
			System.out.println("Intervalo (50,75)");
		}
		
		else if (N <= 100) {
			System.out.println("Intervalo (75,100)");
		}
		
		else {
			System.out.println("Não encontrado no sistema.");
		}
		
		
	
}
	
}
