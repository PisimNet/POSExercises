package chap5ex;

class SafeStack extends Stack implements ISafeStack{ 
	public SafeStack(int n) {
	super(n);
	} 
	public boolean isFull() { 
    return index == stackarray.length -1; 
    } 
	public boolean isEmpty() { 
	return index == -1;
	} 
}
