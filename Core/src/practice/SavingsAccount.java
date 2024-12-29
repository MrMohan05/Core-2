package practice;

public class SavingsAccount extends BankAccount
{

	double interestRate;
	public SavingsAccount(double interestRate) 
	{
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double balance)
	{
		super.balance+=balance;
	}

	@Override
	public void withdraw(double balance)
	{
		super.balance-=balance;
	}

	@Override
	public String displayAccountInfo() 
	{
		return super.accountHolder+" "+super.balance;
	}

}
