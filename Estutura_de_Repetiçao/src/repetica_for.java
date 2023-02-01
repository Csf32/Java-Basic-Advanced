import java.util.Scanner;

public class repetica_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Programa que soma os números
		
		int N = sc.nextInt(); 
		int soma = 0;
	
		for(int i = 0; i < N; i++) { 
			
			int x= sc.nextInt();
			soma += x;
	
		}
		
		System.out.println(soma );
		sc.close();	
	}

}
