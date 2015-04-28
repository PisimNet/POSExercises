import java.util.ArrayList;
import java.util.List;

public class TestResult {

	private List <Throwable> errors = new ArrayList<Throwable>();
	private List <AssertionFailedError> failures = new ArrayList<AssertionFailedError>();
	
	protected int runTests = 0;

	public TestResult() {

	}

	public synchronized void startTest(Test test) {
		runTests++;		
	}

	public void addFailure(TestCase testCase, AssertionFailedError e) {
		//TODO save causing testCase!
		failures.add(e);
		
	}

	public void addError(TestCase testCase, Throwable e) {
		//TODO save causing testCase!
		errors.add(e);
		
	}
}
