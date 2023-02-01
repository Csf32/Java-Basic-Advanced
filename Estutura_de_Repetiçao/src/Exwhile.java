import java.util.Scanner;

public class Exwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x  < 3) {
			
			y = y + 2;
			x = x + 1;
			
			System.out.println(x + "-" + y);
			
		sc.close();
		}
	}

}
