package exercicio;

public class Pacote_ExercicioFicaxao {
	
	private String account_holder;
	private double initial_deposit;
	private int number_of_account;
	public String answer;
	private double balance;
	
	
		
	public Pacote_ExercicioFicaxao(String account_holder, double initial_deposit, int number_of_account, String answer) {
		this.account_holder = account_holder;
		this.number_of_account = number_of_account;
		this.answer = answer;
		deposit(initial_deposit); 
	}
	
	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public double getInitial_deposit() {
		return initial_deposit;
	}

	public void setInitial_deposit(double initial_deposit) {
		this.initial_deposit = initial_deposit;
	}

	public int getNumber_of_account() {
		return number_of_account;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		
		balance += amount;
	}
	
	public void withdraw(double amount) {
		
		balance -= amount + 5.0;
	}
	
	
	public String toString() {
		return account_holder
		+ " "		
		+ number_of_account
		+ ", "
		+ "Holder: "
		+ account_holder
		+ ", "
		+ "Balance: "
		+ "$ "
		+ String.format("%.2f", balance);
		
	}

	
	
	
	
	
}
