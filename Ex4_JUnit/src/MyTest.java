
public class MyTest extends TestCase{

	public MyTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void first() throws AssertionFailedError{
		System.out.println("executing first");
		assertTrue(true);
	}
	public void second() throws AssertionFailedError{
		System.out.println("executing second");
		assertTrue(false);
	}
}
