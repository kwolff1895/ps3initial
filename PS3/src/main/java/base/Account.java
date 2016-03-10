package base;
import java.util.Date;

public class Account {
	private int ID;
	private double Balance;
	private double AnnualInterestRate;
	private Date DateCreated;
	
	//No arg constructor for the default account
	public Account() {
		ID = 0;
		Balance = 0.0;
		AnnualInterestRate = 0.0;
		}
	//Constructor with specific ID and Balance
		public Account(int newID, double newBalance) {
			ID = newID;
			Balance = newBalance;
		}
	// Accessor and mutator methods for ID, Balance
	// and AnnualInterestRate
		public int getID() {
			return ID;
		}
		public void setID(int newID) {
			ID = newID;
		}
		public double getBalance() {
			return Balance;
		}
		public void setBalance(double newBalance) {
			Balance = newBalance;
		}
		public double getAnnualInterestRate() {
			return AnnualInterestRate;
		}
		public void setAnnualInterestRate(double newAnnualInterestRate) {
			AnnualInterestRate = newAnnualInterestRate;
		}
		// 
		public Date getDateCreated() {
			return DateCreated;
		}
		// Method that calculates the monthly interest rate
		public double getMonthlyInterestRate(){
			double MonthlyInterestRate =  AnnualInterestRate / 12;
			return MonthlyInterestRate;
		}
		// Withdraw Method 
		public void Withdraw(double amount)throws InsufficientFundsException{
			if (amount <= Balance){
				Balance -= amount;
			}
			else{
				double needs = amount - Balance;
				throw new InsufficientFundsException(needs);
			}
			}
		// Method that deposits money 
		public void deposit(double amount){
			Balance+= amount;
	}


}
