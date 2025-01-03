package userDefinedException;

public interface Bank 
{
	public void deposite(double amount) throws InvalidAmountException;
	
	public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException;
	
	public void transfer(BankAccount toAccount,double amount) throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException;
	
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException;
	
	public double getBalance();
}
