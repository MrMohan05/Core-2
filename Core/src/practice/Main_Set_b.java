package practice;

public class Main_Set_b 
{
	public static void main(String[] args)
	{
		NumberChecker n=new NumberChecker()
		{
			@Override
			public boolean checkNumber(int a) 
			{
				if(a==1)
				{
					return false;
				}
				for(int i=2;i<a;i++)
				{
					if(a%i==0)
					{
						return false;
					}
				}
				return true;
			}
		};
		System.out.println("Number is prime or not :"+n.checkNumber(13));
		CharChecker c=new CharChecker()
		{
			@Override
			public void checkChar(char c) 
			{
				int n=c;
				int cnt=0;
				for(int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						cnt++;
					}
				}
				if(cnt==0)
				{
					System.out.println("ASCII value of char is prime number");
				}
				else
				{
					System.out.println("ASCII value of char is not a prime number");
				}
			}
			
		};
		c.checkChar('o');
	}
}
