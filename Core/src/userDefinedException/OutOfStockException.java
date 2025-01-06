package userDefinedException;

@SuppressWarnings("serial")
public class OutOfStockException extends RuntimeException
{
	public OutOfStockException(String name)
	{
		super(name);
	}
}	
