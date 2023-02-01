import java.util.Scanner;

public class operador_binario {

	public static void main(String[] args) {
		//Verificar um número bit a bit
		
		Scanner sc = new Scanner(System.in);
		
	
		int bin = 0b100000;
		int n = sc.nextInt();
		
		if((bin & n) != 0) {
			System.out.println("6th bit is true");
		}
		else {
			System.out.println("6th bit is false");
		}
		
		sc.close();
	}
		
		
}
