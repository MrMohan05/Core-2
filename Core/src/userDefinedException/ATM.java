package userDefinedException;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter user name :");
			String name=sc.next();
			System.out.println("Enter account number :");
			long account=sc.nextLong();
			BankAccount b=new BankAccount(account,25000);
			BankAccount b1=new BankAccount(582,10000);
			Customer c=new Customer(name, b);
			double balance;
			int t=1;
			while(t==1)
			{
			try
			{
				System.out.println("1]deposit \n2]withdraw \n3]transfer \n4]loan application \n5]check balance");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Account name :"+c.getName());
					System.out.print("Enter amount to deposite :");
					balance=sc.nextInt();
					b.deposite(balance);
					break;
				case 2:
					System.out.println("Account name :"+c.getName());
					System.out.print("Enter amount to withdraw :");
					balance=sc.nextInt();
					b.withdraw(balance);
					break;
				case 3:
					System.out.println("Account name :"+c.getName());
					System.out.print("Enter account number :");
					long l=sc.nextLong(); 
					b1.setAccountNumber(l);
					System.out.print("Enter amount to transfer :");
					balance=sc.nextInt();
					b.transfer(b1, balance);
					break;
				case 4:
					System.out.println("Account name :"+c.getName());
					System.out.print("Enter amount to apply for loan :");
					balance=sc.nextInt();
					b.applyForLoan(balance);
					break;
				case 5:
					System.out.println("Account name :"+c.getName());
					System.out.println("Balance :"+b.getBalance());
					break;
				}
			}
			catch(InsufficientFundsException | AccountNotFoundException | InvalidAmountException | LoanNotAllowedException e)
			{
				if(e instanceof InsufficientFundsException)
				{
					System.out.println(e);
				}
				else if(e instanceof AccountNotFoundException)
				{
					System.out.println(e);
				}
				else if(e instanceof InvalidAmountException)
				{
					System.out.println(e);
				}
				else if(e instanceof LoanNotAllowedException)
				{
					System.out.println(e);
				}
			}
			catch(Exception e)
			{
				System.out.println("Unexpected exception occuerd");
			}
			System.out.println("Want to continue! then 1");
			t=sc.nextInt();
			}
		}
	}
}
