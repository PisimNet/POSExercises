package CommandBlatt2;

class WithDrawalCommand implements Command {
	
	BankAccount account;
	private int money;
	
	public WithDrawalCommand(BankAccount account, int money) {
		this.account = account;
		this.money=money;
	}

	@Override
	public void execute() {
		account.take(money);
		account.check();
	}

	@Override
	public void undo() {
		account.reject();
		account.put(money);
		account.check();
	}

}
