public class MyTestExecutor {

	public static void main(String[] args) {

		TestSuite suite = new TestSuite();
		suite.addTest(new MyTest("first"));
		suite.addTest(new MyTest("second"));
		TestResult result = new TestResult();
		suite.run(result);
		
		System.out.println(result);
	}

}
