package interfacePrograms;

public class Airtel implements SIMCardInterface
{
	long phno=(long)Math.random()*963852;
	boolean isActivate=false;
	public Airtel( boolean isActivate) 
	{
	
	this.isActivate = isActivate;
	}

	@Override
	public void phonenumber() 
	{
		System.out.println(phno);
	}

	@Override
	public void networkprovider() 
	{
		System.out.println("Airtel is a network privider");
	}

	@Override
	public void status() 
	{
		if(isActivate)
		{
			System.out.println("Activated");
		}
		else
		{
			System.out.println("Deactivated");
		}
	}
}
