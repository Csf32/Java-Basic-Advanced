import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
comentar em um dia e terminar em outro, tendo uma duração mínima de 1h máxima de 24h*/
		
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int calcular;
		
		if(h2 > h1) {
			calcular = h2 - h1;
		}
		else {
			calcular = 24 - h1 +h2;
		}
		
		System.out.println("O jogo durou "+ calcular + "Horas (s)");

		sc.close();
	}

}
