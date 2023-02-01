import java.util.Scanner;

public class ex2while {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		while(x != 2002) {
			
			System.out.println("Senha Inválida");
			x = sc.nextInt();
		}
		
			System.out.println("Senha inválida");
		
		sc.close();
	}

}
