import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestSuite implements Test {

	private List<Test> tests = new ArrayList<Test>();

	@Override
	public void run(TestResult result) {
		Iterator<Test> iter = tests.iterator();
		while(iter.hasNext()){
			Test test = iter.next();
			test.run(result);
		}

	}
	
	public void addTest(Test test){
		tests.add(test);
	}

}
