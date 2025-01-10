package multiThreading;

class Prime1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				if(i==1 || i==2||i==3||i==5||i==7)
				{
					System.out.println ("Prime No.= "+i);
				}
				 Thread.sleep(500);
			}
		}
		catch (Exception e){}
	}
}
class NotPrime1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				if( i==4||i==6||i==8||i==9||i==10)
				{
					System.out.println ("Non-Prime No.= "+i);
				}
				 Thread.sleep(500);
			}
		}
		catch (Exception e){}
	}
}
class Test
{
	public static void main(String args[])
	{

		new Prime1().start();
		new NotPrime1().start();
	}
}
