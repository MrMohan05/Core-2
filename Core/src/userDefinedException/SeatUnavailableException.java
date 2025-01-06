package userDefinedException;

@SuppressWarnings("serial")
public class SeatUnavailableException extends Exception
{
	public SeatUnavailableException(String name)
	{
		super(name);
	}
}
