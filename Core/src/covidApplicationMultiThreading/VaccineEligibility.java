package covidApplicationMultiThreading;

import javax.management.RuntimeErrorException;

public class VaccineEligibility 
{	
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age,boolean hasHealthCondition) 
	{	
		this.age=age;
		this.hasHealthCondition=hasHealthCondition;
	}
	
	public void isEligible()
	{
		if((age<=18 || age>=60) || hasHealthCondition==true)
			throw new RuntimeException("Not eligible");
	}
}
