import java.util.Scanner;

import Utilitario.PacoteConstrutor;

public class Construtores {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);		
		
		
		System.out.println("Enter product data: " );
		 
		System.out.print("Name: "  );
	
		
		String Name = sc.next(); 
		System.out.print("Price: ");
		
		double price = sc.nextDouble();		
		System.out.print("Quantidy in stock: ");
	
		
		int quantidy_in_stock = sc.nextInt();
		
		
		PacoteConstrutor products = new PacoteConstrutor(Name, price, quantidy_in_stock);
		

		
		System.out.println();
		System.out.print(products.toString()); 
			
	
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		
		
		quantidy_in_stock = sc.nextInt();
		products.addProucts(quantidy_in_stock);
		
		System.out.println();
		System.out.print("Update data:" + products.toString());
		
	
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		
		quantidy_in_stock = sc.nextInt();
		products.removeProducts(quantidy_in_stock);
		
		System.out.println();
		System.out.print("Update data:" + products.toString());
				
		sc.close();
	}

}


