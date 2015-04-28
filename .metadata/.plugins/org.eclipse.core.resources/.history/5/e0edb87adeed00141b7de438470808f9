package CommandBlatt2;

class Client {
	
public static void main(String[] args) {
	
	CashMachine cashmachine = new CashMachine();
	
	BankAccount account = new BankAccount(500);
	
	DepositCommand deposit = new DepositCommand(account, 50);
	WithDrawalCommand withdraw = new WithDrawalCommand(account, 20);
	
	/* Command[] withdraws = {withdraw, withdraw, withdraw, withdraw};
    Command[] deposits = {deposit,deposit,deposit,deposit};
	
    MacroCommand w = new MacroCommand(withdraws);
	MacroCommand d = new MacroCommand(deposits); */
	
	cashmachine.setCommand(0, deposit, withdraw);
	cashmachine.pressDeposit(0);
	cashmachine.pressWithdraw(0);
	
}
}
