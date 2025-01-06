package userDefinedException;

@SuppressWarnings("serial")
public class InvalidReservationException extends RuntimeException
{
	public InvalidReservationException(String name) 
	{
		super(name);
	}
}
