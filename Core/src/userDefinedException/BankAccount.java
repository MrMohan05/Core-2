package userDefinedException;

public class BankAccount implements Bank
{
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	@Override
	public void deposite(double amount) throws InvalidAmountException 
	{
		if(amount<=0)
		{
			throw new InvalidAmountException("Amount should be greter than 0");
		}
		balance+=amount;
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException 
	{
		if(amount<=0)
		{
			throw new InvalidAmountException("Amount should be greter than 0");
		}
		if(balance<amount)
		{
			throw new InsufficientFundsException("You do not have that much amount to withdraw from your account");
		}
		balance-=amount;
	}
	@Override
	public void transfer(BankAccount toAccount, double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException 
	{
		if(amount<=0)
		{
			throw new InvalidAmountException("Amount should be greter than 0");
		}
		if(balance<amount)
		{
			throw new InsufficientFundsException("You do not have that much amount to withdraw from your account");
		}
		if(toAccount == null )
		{
			throw new AccountNotFoundException("Account does not exist");
		}
		balance-=amount;
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException 
	{
		if(amount<=0)
		{
			throw new InvalidAmountException("Amount should be greter than 0");
		}
		if(amount>50000 && balance<50000)
		{
			throw new LoanNotAllowedException("Loan not allowed");
		}
		System.out.println("Loan granted of :"+amount);
	}
	@Override
	public double getBalance() {
		return balance;
	}
	
}
