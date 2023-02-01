import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double y;
		
		y = sc.nextDouble();
		
		System.out.printf("%.2f%n", y);
		sc.close();
	}

}
