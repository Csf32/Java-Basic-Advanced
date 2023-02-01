import java.util.Locale;

public class operacaomatematica {

	public static void main(String[] args) {
		
		//Calcular operações matemáticas e determinar suas saídas
		
		double x = 2.0;
		double y = 3.0;
		double z = -4.0;
		double A, B, C;
	
		
		A = Math.sqrt(x);
		B = Math.pow(x, y);
		C = Math.abs(z);
		
		System.out.println("Resultados: ");
		Locale.setDefault(Locale.US);
		System.out.printf("Ra�z quadrada de A = %.2f%n", A);
		System.out.println("A pot�ncia de x elevado a y � = " + B);
		System.out.println("O valor absoluto de z � = " + C);
		
		
		
		
		
		
		
		

	}

}
