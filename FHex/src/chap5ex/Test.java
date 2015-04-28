package chap5ex;

public class Test {

	public static void main(String[] args) {
		SafeStack s=new SafeStack(10);
		s.push("hello");
		s.push(new Integer(7));
		s.push(new Character('x'));
		s.push(new Double(3.14));
		ISafeStack iss=s;
		IStack is=s;
		Stack a=s;
		System.out.println(s.isFull());
		System.out.println(s.pop());
		System.out.println(a.pop());
		System.out.println(is.pop());
		System.out.println(iss.pop());
		System.out.println(s.isEmpty());
	}
}