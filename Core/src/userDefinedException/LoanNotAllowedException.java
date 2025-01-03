package userDefinedException;

@SuppressWarnings("serial")
public class LoanNotAllowedException extends RuntimeException
{
	public LoanNotAllowedException(String name)
	{
		super(name);
	}
}
