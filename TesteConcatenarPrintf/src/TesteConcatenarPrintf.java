
public class TesteConcatenarPrintf {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.0;
		double measure = 53.234567;
		
		/*Produza as seguintes saída:
		Products:
		Computer, wich price is $2100,00
		Office desk, wich price is $650,50
		
		Record: 30 years old, code 5290 and gender: F
		
		Measure with eight decimal places: 53,234567
		Rouded: 53,235
		US decimal point: 53.235
		*/
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price is $%.2f%n", product2, price2);
		
		System.out.println("Record:" + age + " years old," + " code " + code + " and gerder: " + gender );
		System.out.println("Measure with eight decimal places:" + measure);
		System.out.printf("Rouded: %.3f%n", measure);
		
		
	}

}
