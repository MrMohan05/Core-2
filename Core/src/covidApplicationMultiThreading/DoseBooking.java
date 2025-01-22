package covidApplicationMultiThreading;

public class DoseBooking 
{
	private boolean booked;
	public void bookDose()
	{
		if(isDoseBooked())
		{
			throw new RuntimeException("Does already booked");
		}
		booked=true;
	}
	boolean isDoseBooked()
	{
		if(booked==true)
		return true;
		return false;
	}
}
