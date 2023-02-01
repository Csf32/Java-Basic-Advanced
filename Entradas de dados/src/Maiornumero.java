import java.util.Scanner;

public class Maiornumero {

	public static void main(String[] args) {
		// Digite 3 números e diga o maior entre eles

		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		
		if (x1 > x2 && x1 > x3) {
			
			System.out.println("O maior � " + x1);
		}
		else if(x2 > x3) {
			System.out.println("O maior � " + x2);
			
		}else {
			System.out.println("O maior � " + x3);
		}
		
		
		sc.close();
	}

}
