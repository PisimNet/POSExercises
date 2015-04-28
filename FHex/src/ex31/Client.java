package ex31;

class Client extends Person {
		 String favouriteColour; 
		 
		 public Client (int n, String s, String f){ 
		 super(n,s); 
		 favouriteColour=f; 
		 } 
		 
		 void givePresent() { 
		 if(age < 10) 
		 System.out.println(name + " gets a matchbox car, color "+favouriteColour);
		 else 
		 System.out.println(name + " gets a pencil, color "+favouriteColour);
		 } 
}  
