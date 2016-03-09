package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}
	
	@Before
	public void setUp() throws Exception{
	}
	
	@After 
	public void tearDown() throws Exception{
	}
	
	protected int id;
	protected double balance, annualInterestRate;
	

	// assigning the values
	protected void setUp1() {
		id = 1122;
		balance = 20000;
		annualInterestRate = 4.5;

	}

	// test methods
	@Test(expected=InsufficientFundsException.class)
		public void testWithdraw(double amount)throws InsufficientFundsException{
			amount = 2500;
			if (amount <= balance){
				balance -= amount;
			}
			else{
				double needs = amount - balance;
				throw new InsufficientFundsException(needs);
			}
			assertTrue(balance == 17500);
			}
	@Test(expected=InsufficientFundsException.class)
	public void testWithdraw2(double amount)throws InsufficientFundsException{
		amount = 30000;
		if (amount <= balance){
			balance -= amount;
		}
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
		assertTrue(balance == 20000);
		}
		
	@Test
	public void testDeposit(double amount){
		amount = 3000;
		balance+= amount;
			
		assertTrue(balance == 23000);		
	}

	System.out.println("The balance is:$ " + balance + "The monthly interest is: " + (balance * (annualInterestRate/12)) + "The date the account was created: " + dateCreated);
}
