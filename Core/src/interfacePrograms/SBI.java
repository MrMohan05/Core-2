package interfacePrograms;

public class SBI implements Bank
{

	double accountBalance;
	
	public SBI(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	@Override
	public void depositing(double amount) 
	{
		accountBalance+=amount;
		System.out.println("Amount deposited SBI");
	}

	@Override
	public void withdrawing(double amount) 
	{
		accountBalance-=amount;
		System.out.println("Amount wirthdraw SBI");
	}

	@Override
	public void balence() 
	{
		System.out.println("Account balance SBI: "+accountBalance);
	}

}
