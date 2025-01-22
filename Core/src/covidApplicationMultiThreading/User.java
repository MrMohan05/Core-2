package covidApplicationMultiThreading;

public class User 
{
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) 
	{
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
		eligibility.isEligible();
	}

	public static void main(String[] args) 
	{
		User u1=new User("User 1",new VaccineEligibility(25, false), new DoseBooking());
		User u2=new User("User 2",new VaccineEligibility(14, false),new DoseBooking());
	}
}
