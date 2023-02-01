package Override;

import entities.Account;
import entities.BusinessAccount_Super;
import entities.SavingsAccount_Override;

public class Program_with_Override {

	public static void main(String[] args) {
		
		
		Account acco = new Account(1001, "Jõao", 1000.0);
		acco.withdraw(200.0);
		System.out.println(acco.getBalance());
		
		Account acco1 = new SavingsAccount_Override(1002, "Maria", 1000.0, 0.01);
	
		acco1.withdraw(200.0);
		System.out.println(acco1.getBalance());

		
		Account acco2 = new BusinessAccount_Super(1006, "Cláudia", 1000.0, 500.0);
		
		acco2.withdraw(200.0);
		System.out.println(acco2.getBalance());
		
		
	}

}
