package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Exercicio.Employee;
import Exercicio.OutsourcedEmployee;

public class Program_Exercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
	
		System.out.print("Enter the number of employees: ");		
		int numberofEmployees = sc.nextInt();
		
		for(int i =1; i<= numberofEmployees; i++) {
			
			System.out.println("Employee #" + i + "data: ");
			System.out.print("Outsoucerd (y/n)?");
			String answer = sc.next();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(answer.equals("y")){
				
				System.out.print("Value per hour: ");
				Double additionalCharge = sc.nextDouble();
		
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
				
		
			}
			
			else{
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		
		System.out.println();
		System.out.println("Payments: ");
		
		for(Employee emp : list) {
			System.out.print(emp.getName() + " - $ " + String.format("%.2f", emp.Payments()));
		}
		
		
		sc.close();
	}

}
