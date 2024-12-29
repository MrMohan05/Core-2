package practice;

public abstract class BankAccount
{
	String accountHolder="Mohan";
	double balance;
	public abstract void deposit(double balance);
	public abstract void withdraw(double balance);
	public abstract String displayAccountInfo();
	public double displayBalance()
	{
		return balance;
	}
}
