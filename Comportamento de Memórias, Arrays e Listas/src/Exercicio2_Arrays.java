import java.util.Locale;
import java.util.Scanner;

import exercicio2.PacotedoExercicio2;

public class Exercicio2_Arrays {

	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero inteiro N e os dados (nome e
pre�o) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o pre�o m�dio dos produtos.*/
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();

		PacotedoExercicio2[] vect2 = new PacotedoExercicio2[n1];
		
		for(int i = 0; i<vect2.length; i++) { 
			sc.nextLine(); // Para consumir o int n
			
			String name = sc.nextLine();
			double price = sc.nextDouble();
	
			vect2[i] = new PacotedoExercicio2(name, price);
				
		}
		
		double sum = 0.0;
		
		for (int i = 0; i<vect2.length; i++) {
			
			sum += vect2[i].getPrice();
		}
		
		double media = sum / n1;
		
		System.out.printf("%.2f", media);
		sc.close();
	}

}
