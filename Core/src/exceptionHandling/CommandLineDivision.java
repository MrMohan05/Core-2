package exceptionHandling;

public class CommandLineDivision 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			try
			{
				System.out.println("Division :"+a/b);
			}
			catch(ArithmeticException e)
			{
				System.out.println("can not divid by zero");
			}
			finally
			{
				System.out.println("Division is compeated");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("insufficient arguments or invalid input types");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Argument is not appropriat");
		}
	}
}
