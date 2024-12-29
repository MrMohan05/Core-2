package practice;

public class BankingMain
{
	public static void main(String[] args)
	{
		SavingsAccount s=new SavingsAccount(10);
		s.balance=20000;
		System.out.println("Account holder information :"+s.displayAccountInfo());
		System.out.println("Account balance :"+s.displayBalance());
		s.deposit(15000);
		System.out.println("Account balance :"+s.displayBalance());
		s.withdraw(10000);
		System.out.println("Account balance :"+s.displayBalance());
	}
}
