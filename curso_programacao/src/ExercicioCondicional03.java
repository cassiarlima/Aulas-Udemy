import java.util.Scanner;

/*
 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente.
 */
public class ExercicioCondicional03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe dois n�meros para saber se s�o m�ltiplos");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		
		if (A%B==0 || B%A==0) {
			System.out.println("Os valores s�o m�ltiplos");
			
		}

		else {
			System.out.println("Os valores n�o s�o m�ltiplos");
		}
}

}	