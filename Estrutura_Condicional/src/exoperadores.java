import java.util.Scanner;

public class exoperadores {

	public static void main(String[] args) {
		
		/*50 reais por 100 minutos
		 * excedendo da 2$/minuto*/
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		if(x > 50 || y > 100) {
			
			System.out.println("Valor a ser pago �:" + (x + 2) + " ,Minutos totais: " + (y+2));
			
		}
		
		else {
			if(x <= 50 || y <= 100) {
			System.out.println("Valor a ser pago �:" + 50 + " ,sem Minutos excedidos");
			}
		}
		sc.close();
	}

}
