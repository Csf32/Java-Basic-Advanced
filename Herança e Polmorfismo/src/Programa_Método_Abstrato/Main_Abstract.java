package Programa_Método_Abstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import MétodoAbstrato.Circle;
import MétodoAbstrato.Rectangle;
import MétodoAbstrato.Shape;
import enum_Abstract.Color;

public class Main_Abstract {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int shapes = sc.nextInt();
		
		for(int i = 1; i<=shapes; i++) {
			
			System.out.println("Shape " + "#" + i + "data:");
			System.out.print("Rectangle or Circle (r/c)?");
			String choose = sc.next();
			
			
			if(choose.equalsIgnoreCase("r")) {
				
				System.out.print("Color (BLACK/BLUE/RED): ");
				
				Color color = Color.valueOf(sc.next());
				
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				
				System.out.print("Height: ");
				Double height = sc.nextDouble();
			
				Shape sh = new Rectangle(color, width, height);
				
				list.add(sh);
				
			}
			else {
				
				System.out.print("Color (BLACK/BLUE/RED): ");
				
				Color color = Color.valueOf(sc.next());
				
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				System.out.println();
				
				Shape sh1= new Circle(color, radius);
				list.add(sh1);
				
			}
		}
		
		
		System.out.println("SHAPE AREAS: ");
		
		for(Shape s: list) {
			
			System.out.println(String.format("%.2f", s.area()));
		}
		

		
		sc.close();
	}

}
