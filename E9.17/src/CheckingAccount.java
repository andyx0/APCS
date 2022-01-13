public class CheckingAccount extends BankAccount
{
	private int transactions;
	final int FREE_TRANSACTIONS = 3;
	final int EXTRA_FEE = 1;
	
	public CheckingAccount()
	{
		transactions = 0;
	}
	
	@Override
	public void deposit(double amount)
	{
		super.deposit(amount);
		transactions++;
		calcFee();
	}
	
	@Override
	public void withdraw(double amount)
	{
		super.withdraw(amount);
		transactions++;
		calcFee();
	}
	
	public void calcFee()
	{
		if(transactions > FREE_TRANSACTIONS)
		{
			super.withdraw(EXTRA_FEE);
		}
	}
	
	@Override
	public void monthEnd()
	{
		transactions = 0;
	}
}