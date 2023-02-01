import java.util.Scanner;

import utiliencapsulamento.PacoteEncapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);		
				
		System.out.println("Enter product data: " );
		 
		System.out.print("Name: "  );
				
		String Name2 = sc.next(); 
		System.out.print("Price: ");
		
		double price2 = sc.nextDouble();		
			
		PacoteEncapsulamento products2 = new PacoteEncapsulamento(Name2, price2);

				
		products2.setName2("Computer");
	
		
		System.out.println("Update name" + products2.getName2());
		

		products2.setPrice2(1200);
		System.out.println("Update price" + products2.getPrice2());
				
		System.out.println();
		System.out.print(products2.toString());
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		
		int quantidy_in_stock2 = sc.nextInt();
		products2.addProucts2(quantidy_in_stock2);
		
		System.out.println();
		System.out.print("Update data:" + products2.toString());
		
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		
		quantidy_in_stock2 = sc.nextInt();
		products2.removeProducts2(quantidy_in_stock2);
		
		System.out.println();
		System.out.print("Update data:" + products2.toString());
				
		sc.close();
	}


}
