import java.util.Scanner;

import utilisobrecarga.PacoteSobrecarga;

public class Sobrecarga {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter product data: " );
		 
		System.out.print("Name: "  );

		String Name1 = sc.next(); 
		System.out.print("Price: ");
	
		double price1 = sc.nextDouble();		
	
		PacoteSobrecarga products1 = new PacoteSobrecarga(Name1, price1);
	
		System.out.println();
		System.out.print(products1.toString()); 
	
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
	
		int quantidy_in_stock1 = sc.nextInt();
		products1.addProucts1(quantidy_in_stock1);
		
		System.out.println();
		System.out.print("Update data:" + products1.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		
		quantidy_in_stock1 = sc.nextInt();
		products1.removeProducts1(quantidy_in_stock1);
		
		System.out.println();
		System.out.print("Update data:" + products1.toString());
				
		sc.close();
	}


	}


