package entities;

public class SavingsAccount_Override extends Account {
	//Taxa de juros
		private Double interestRate;
		
		 
		public SavingsAccount_Override() {
			super();
		}

		public SavingsAccount_Override(Integer number, String holder, Double balance, Double interestRate) {
			super(number, holder, balance);
			this.interestRate = interestRate;
		}

		public Double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(Double interestRate) {
			this.interestRate = interestRate;
		}

		public void updateBalance() {
			
			balance += balance * interestRate;
		}
		
		@Override
		public void withdraw(double amount) {
			
			balance -= amount;
			
		}
}
