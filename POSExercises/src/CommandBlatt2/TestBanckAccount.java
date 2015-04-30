package CommandBlatt2;
import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBanckAccount extends TestCase {
	private int balance;
	private int money;
	
	public TestBanckAccount() {
		
	}


	@Before
	public void setUp() throws Exception {
		balance = 100;
		money = 50;
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPut() {
		int result = balance + money; 
		assertEquals(result, new BankAccount(balance).put(money));
	}
	
	@Test
	public void testTake(){
	// account = new BankAccount(balance);
	int result1 = balance - money;
	assertEquals(result1, new BankAccount(balance).take(money));
	}

}
