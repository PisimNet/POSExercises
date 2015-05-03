package CommandBlatt2;
import junit.framework.TestCase;

public class TestBanckAccount extends TestCase {
	private int balance;
	private int money;
	
	BankAccount acc;
	
	public TestBanckAccount() {
		
	}

	public void setUp() throws Exception {
		balance = 100;
		money = 50;
		acc = new BankAccount(balance);
	}
	
	//After
	public void tearDown() throws Exception {
	}

	//Test
	public void testPut() {
		int result = balance + money;
		assertEquals(result, acc.put(money));
	}
	
	//Test
	public void testTake(){
	int result1 = balance - money;
	assertEquals(result1, acc.take(money));
	}

}
