import java.util.Scanner;

public class ex2while {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		while(x != 2002) {
			
			System.out.println("Senha Inv�lida");
			x = sc.nextInt();
		}
		
			System.out.println("Senha inv�lida");
		
		sc.close();
	}

}
