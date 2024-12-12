package interfacePrograms;

public class ICICI implements Bank
{
	double accountBalance;
	public ICICI(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}
	@Override
	public void depositing(double amount) 
	{
		accountBalance+=amount;
		System.out.println("Amount deposited ICIC");
	}

	@Override
	public void withdrawing(double amount) 
	{
		accountBalance-=amount;
		System.out.println("Amount wirthdraw ICIC");
	}

	@Override
	public void balence() 
	{
		System.out.println("Account balance ICIC : "+accountBalance);
	}
}
