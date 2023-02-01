import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 0; i <= x; i++) {
			
			// 10 x i = resultado
			
			int result = i*x;
			System.out.println(x + " x " + i + " = " + result);
		}
		
		sc.close();
	}

}
