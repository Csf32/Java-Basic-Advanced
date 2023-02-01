import java.util.Scanner;
public class Stringchar0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Ler um caractere e armazenar a primeira variável na forma de string
		
		char x;
		x = sc.next().charAt(0);
		
		System.out.println("Digita " + x);
		sc.close();
		
		
		
	}

}
