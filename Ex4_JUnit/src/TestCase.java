import java.lang.reflect.Method;


public abstract class TestCase implements Test{

	int i;
	private final String name;
	
	public TestCase(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		// TODO provide more useful information 
		return name;
	}

	public TestResult run() {
		TestResult result = createTestResult();
		run(result);
		return result;
	}
	
	private TestResult createTestResult() {
		
		return new TestResult();
	}

	@Override
	public void run(TestResult result) {
		result.startTest(this);
		setUp();
		try{
			runTest();
		}
		catch(AssertionFailedError e){
			result.addFailure(this, e);
		}
		catch(Throwable e){
			result.addError(this, e);
		}
		finally{
			tearDown();
		}
		
	}

	protected void tearDown() {
		// By default we do nothing
		
	}

	protected void runTest() throws Throwable{
		Method runMethod = null;
		try{
			runMethod = getClass().getMethod(name, new Class[0]);
		}
		catch(NoSuchMethodException e){
			assertTrue("Method not found", false);
		}
		runMethod.invoke(this, new Class[0]);
		
	}

	private void assertTrue(String name, boolean condition) throws AssertionFailedError {
		if(!condition)
			throw new AssertionFailedError(name);
		
	}

	protected void setUp() {
		// By default we do nothing
		
	}
	
	protected void assertTrue(boolean condition) throws AssertionFailedError{
		if(!condition)
			throw new AssertionFailedError();
	}

	
}
