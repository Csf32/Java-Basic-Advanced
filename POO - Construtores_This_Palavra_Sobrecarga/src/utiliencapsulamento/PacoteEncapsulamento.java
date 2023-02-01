package utiliencapsulamento;

public class PacoteEncapsulamento {

	
	private String Name2;
	private double price2;
	private int quantidy_in_stock2;
	
	public PacoteEncapsulamento() {
		
	}
	

	
	
	public PacoteEncapsulamento(String name2, double price2, int quantidy_in_stock2) {
		
		
		this.Name2 = name2;
		this.price2 = price2;
		this.quantidy_in_stock2 = quantidy_in_stock2;
	}



	public PacoteEncapsulamento(String name2, double price2) {
		
		this.Name2 = name2;
		this.price2 = price2;
	
	}
	

	

	public String getName2() {
		return Name2;
	}

	public void setName2(String name2) {
		this.Name2 = name2;
	}

	public double getPrice2() {
		return price2;
	}

	public void setPrice2(double price2) {
		this.price2 = price2;
	}

	public int getQuantidy_in_stock2() {
		return quantidy_in_stock2;
	}
	

	public double total2() {
		return price2 * quantidy_in_stock2;
	}

	

	public void addProucts2(int quantidy_in_stock2) { 
		
		this.quantidy_in_stock2 += quantidy_in_stock2; 
	}
	
	public void removeProducts2(int quantidy_in_stock2) {
		
		this.quantidy_in_stock2 -= quantidy_in_stock2;
	}
	
	public String toString() { 
		return Name2
			+ ", $ "
			 //price com 2 casas:
			+ String.format("%.2f", price2)
			+ ", "
			+ quantidy_in_stock2
			+ " units, Total: $ "
			+ String.format("%.2f", total2());
	}

}
