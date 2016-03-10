package base;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;

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
	
	int ID = 1122;
	double Balance = 20000;
	double AnnualInterestRate = 4.5;
	Date DateCreated;

	// Test of all the methods created
	@Test(expected=InsufficientFundsException.class)
		public void testWithdraw()throws InsufficientFundsException{
			double amount = 2500;
			if (amount <= Balance){
				Balance -= amount;
			}else{
				double needs = amount - Balance;
				throw new InsufficientFundsException(needs);
			}
			assertTrue(Balance == 12000);
			}
	@Test(expected=InsufficientFundsException.class)
	public void testWithdraw2()throws InsufficientFundsException{
		double amount = 30000;
		if (amount <= Balance){
			Balance -= amount;
		}else{
			double needs = amount - Balance;
			throw new InsufficientFundsException(needs);
		}
		assertTrue(Balance == 9000);
		}
		
	@Test
	public void testDeposit(){
		double amount = 3000;
		Balance += amount;
		
		assertTrue(Balance == 34000);		
	}
	@Test
	public void testAccount(){
	System.out.println("The balance is:$ " + Balance);
	System.out.println("The monthly interest is: " +(Balance * (AnnualInterestRate/12)));
	System.out.println("The date that the account was created is: " + DateCreated);
}
}

