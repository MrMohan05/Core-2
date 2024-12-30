package exceptionHandling;

public class DivisionExample 
{
	public static int performDivision(int dividend,int diviser)throws ArithmeticException
	{
		return dividend/diviser;
	}
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Division of the numbers is:"+performDivision(10, 0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divison by zero is not allowed");
		}
	}
}
