package chap5ex;

class Stack implements IStack {
	// Array for saving the stack
	protected Object[] stackarray; 
	// Number of highest element
	protected int index; 
	// Construktor
	public Stack(int n){
	stackarray=new Object[n];
	index=-1;
	}
	public void push(Object item)
	{ stackarray[++index]=item;
	}
	public Object pop(){
	Object o=stackarray[index];
	stackarray[index]=null;
	index--;
	return o;
	}	
	public Object peek(){
	return stackarray[index]; }
	}
