import java.util.Scanner;

public class exoperadoresaula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*50 reais por 100 minutos
		 * excedendo da 2$/minuto*/
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
			if(minutos > 100) {
				conta = conta + (minutos - 100) * 2;
			}
		System.out.printf("Valor a ser pago: R$ %.2f%n ", conta);
		sc.close();
	}
	   
}
