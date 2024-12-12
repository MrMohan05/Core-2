package interfacePrograms;

public class Customer 
{
	String name;
	double accountBalance;
	
	public Customer(String name, double amount)
	{
		super();
		this.name = name;
		this.accountBalance = amount;
	}
	void deposit(Bank b,double amount)
	{
		b.depositing(amount);
	}
	void withdraw(Bank b, double amount)
	{
		b.withdrawing(amount);
	}
	void checkBalance(Bank b)
	{
		b.balence();
	}
	public static void main(String[] args) 
	{
		Customer c=new Customer("Mohan", 50000);
		Bank b=null;
		
		b=new SBI(50000);
		c.deposit(b,5000);
		c.checkBalance(b);
		c.withdraw(b,10000);
		c.checkBalance(b);
		
		b=new HDFC(50000);
		c.deposit(b,5000);
		c.checkBalance(b);
		c.withdraw(b,10000);
		c.checkBalance(b);
		
		b=new ICICI(50000);
		c.deposit(b,5000);
		c.checkBalance(b);
		c.withdraw(b,10000);
		c.checkBalance(b);
	}
}
