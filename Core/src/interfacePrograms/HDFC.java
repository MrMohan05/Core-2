package interfacePrograms;

public class HDFC implements Bank
{
	double accountBalance;
	public HDFC(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	@Override
	public void depositing(double amount) 
	{
		accountBalance+=amount;
		System.out.println("Amount deposited HDFC");
	}

	@Override
	public void withdrawing(double amount) 
	{
		accountBalance-=amount;
		System.out.println("Amount wirthdraw HDFC");
	}

	@Override
	public void balence() 
	{
		System.out.println("Account balance HDFC: "+accountBalance);
	}
}
