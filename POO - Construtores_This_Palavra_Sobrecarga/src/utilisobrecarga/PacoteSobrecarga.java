package utilisobrecarga;

public class PacoteSobrecarga {

	
	public String Name1;
	public double price1;
	public int quantidy_in_stock1;

	public PacoteSobrecarga(String Name1, double price1, int quantidy_in_stock1) {
	
		this.Name1 = Name1; 
		this.price1 = price1;
		this.quantidy_in_stock1 = quantidy_in_stock1;
	}

	public PacoteSobrecarga(String Name1, double price1) {
	
		this.Name1 = Name1; 
		this.price1 = price1;
		
	}
	
	public double total1() {
		return price1 * quantidy_in_stock1;
	}
	
	public void addProucts1(int quantidy_in_stock1) { 
		
		this.quantidy_in_stock1 += quantidy_in_stock1; 
	}
	
	public void removeProducts1(int quantidy_in_stock1) {
		
		this.quantidy_in_stock1 -= quantidy_in_stock1;
	}
	
	public String toString() { 
		return Name1
			+ ", $ "
			 //price com 2 casas:
			+ String.format("%.2f", price1)
			+ ", "
			+ quantidy_in_stock1 
			+ " units, Total: $ "
			+ String.format("%.2f", total1());
	}
}
