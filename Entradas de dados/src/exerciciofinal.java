import java.util.Locale;

public class exerciciofinal {

	public static void main(String[] args) {
		/*Fazer um programa e ler as medidas da largura e comprimento
		 * de um terreno retangular com casa decimal, bem como o valor
		 * do m2 com duas casas decimais. Mostrar o valor da �rea
		 * do terreno e o valor do pre�o ambos com duas casas decimais*/

		double L, C, Area, Preco;
		
		L = 10.0;
		C = 30.0;
		Preco = 200.00;
		Area = L * C;
		
		
		System.out.println("�rea do terreno = " + Area);
		System.out.println("Valor do terreno = " + Preco * Area);
		
		
		Locale.setDefault(Locale.US);
		System.out.printf("�rea do terreno = %.2f%n", Area);
		System.out.printf("Valor do terreno = %.2f%n", Preco);
		
		
		
		
		
		
		
		
	}

}
