package CommandBlatt2;

import java.util.Scanner;

class Client {
	
public static void main(String[] args) {
	
	CashMachine cashmachine = new CashMachine();
	
	BankAccount account = new BankAccount(500);
	
	Scanner sc= new Scanner(System.in);
	 System.out.println("pls write deposit amount");
    int depositAmount = sc.nextInt();
    System.out.println("pls write withdraw amount?");
    int withdrawAmount = sc.nextInt();
    sc.close();
	
	DepositCommand deposit = new DepositCommand(account, depositAmount);
	WithDrawalCommand withdraw = new WithDrawalCommand(account, withdrawAmount);
	
	/* Command[] withdraws = {withdraw, withdraw, withdraw, withdraw};
    Command[] deposits = {deposit,deposit,deposit,deposit};
	
    MacroCommand w = new MacroCommand(withdraws);
	MacroCommand d = new MacroCommand(deposits); */
	
	cashmachine.setCommand(0, deposit, withdraw);
	cashmachine.pressDeposit(0);
	cashmachine.pressWithdraw(0);
	
}
}
