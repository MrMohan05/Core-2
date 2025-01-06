package userDefinedException;

public class ReservationSystemScenario 
{
	public int availableSeats;

	public ReservationSystemScenario(int availableSeats) 
	{
		this.availableSeats = availableSeats;
	}
	
	public static void main(String[] args) 
	{
		ReservationSystemScenario r=new ReservationSystemScenario(30);
		try
		{
			r.reserveSeat(25);
			r.reserveSeat(35);
		}
		catch(SeatUnavailableException e)
		{
			System.out.println(e);
		}
		try
		{
			r.reserveSeatUnchecked(25);
			r.reserveSeatUnchecked(35);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println(e);
		}
	}
	public void reserveSeat(int numberOfSeats) throws SeatUnavailableException
	{
		if(availableSeats<numberOfSeats)
		{
			throw new SeatUnavailableException("Seats are not available");
		}
		System.out.println("Seats are available cheacked ");
	}
	public void reserveSeatUnchecked(int numberOfSeats) throws InsufficientFundsException
	{
		if(availableSeats<numberOfSeats)
		{
			throw new InsufficientFundsException("Seats are not available");
		}
		System.out.println("Seats are available uncheacked");
	}
}


//1)Seat Reservation System:
//
//You are tasked with developing a Java program for a simple seat reservation system using the ReservationSystem class.
// This class involves two custom exceptions: a checked exception (SeatUnavailableException) and an unchecked exception
// (InvalidReservationException). These exceptions are designed to handle different scenarios related to reserving seats.
//
//* SeatUnavailableException (Checked Exception):
//->This exception should be thrown when an attempt is made to reserve seats that are not available at the moment or when there are 
//insufficient seats for the specified reservation.
//
//* InvalidReservationException (Unchecked Exception):
//->This exception should be thrown when an attempt is made to reserve seats when no seats are available.
//
//
//* ReservationSystem Class:
//
//-> The class should have a private instance variable availableSeats representing the number of available seats.
//-> Implement a constructor to initialize the initial number of available seats.
//-> Implement a method reserveSeat(int numberOfSeats) that reserves seats, throwing SeatUnavailableException for unavailability
//or insufficient seats.
//-> Implement a method reserveSeatUnchecked(int numberOfSeats) that simulates reserving seats, throwing
// InvalidReservationException for no available seats and handling SeatUnavailableException for insufficient seats.
//
//
//* Main Class (ReservationSystemScenario):
//
//-> In the main method, create an instance of ReservationSystem with an initial number of available seats (e.g., 30).
//-> Demonstrate the use of reserveSeat for valid and invalid seat reservations, handling the SeatUnavailableException.
//-> Demonstrate the use of reserveSeatUnchecked for valid and invalid seat reservations, handling both InvalidReservationException and SeatUnavailableException.
//-> Ensure that the program provides clear error messages and handles exceptions appropriately.