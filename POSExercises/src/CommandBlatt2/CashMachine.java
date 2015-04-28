package CommandBlatt2;

class CashMachine {
	
	Command[] deposits;
	Command[] withdraws;
	
	public CashMachine() {
		deposits = new Command[5];
		withdraws = new Command[5];
	}
	
	public void setCommand(int slot,Command deposits, Command withdraws){
	    this.deposits[slot] = deposits;
	    this.withdraws[slot] = withdraws;
}
	public void pressDeposit(int slot){
		deposits[slot].execute();
	}
	
	public void pressWithdraw(int slot){
		withdraws[slot].execute();
	}
	
}
