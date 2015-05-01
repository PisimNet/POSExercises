package CommandBlatt2;

class DepositCommand implements Command {
	
	BankAccount account;
	private int money;

	public DepositCommand(BankAccount account, int money) {
		this.account = account;
		this.money = money;
	}

	public void execute() {
		account.put(money);
		account.check();
	}

	
	public void undo() {
		account.reject();
		account.take(money);
		account.check();
	}

}
