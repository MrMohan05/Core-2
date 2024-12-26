package exceptionHandling;

public class NumberFormatExceptionandNullPointerException
{
	public static void main(String[] args) 
	{
		handleExceptions("abc");
	}
	public static void handleExceptions(String s)
	{
		try
		{
			System.out.println("Length of string :"+s.length());
			int n=Integer.parseInt(s);
			System.out.println("Converted number is :"+n);
		}
		catch(NullPointerException n)
		{
			System.out.println("An NullPointerException occurred :");
			System.out.println("Message :"+n.getMessage());
			System.out.println("String representation :"+n);
			System.out.println("Stack trace :");
			n.printStackTrace();
		}
		catch(NumberFormatException n)
		{
			System.out.println("An NumberFormatException occurred :");
			System.out.println("Message :"+n.getMessage());
			System.out.println("String representation :"+n);
			System.out.println("Stack trace :");
			n.printStackTrace();
		}
	}
}
