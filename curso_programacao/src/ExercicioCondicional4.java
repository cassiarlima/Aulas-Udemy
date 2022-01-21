import java.util.Scanner;

/*
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 */
public class ExercicioCondicional4 {

	public static void main(String[] args) {
		
		int duracao;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a hora inicial do jogo e a hora final: ");
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();	
		
		if(horaInicial < horaFinal) {
			duracao= horaFinal - horaInicial;
		}
		
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao +" hora(s).");
	}

}
