package interfacePrograms;

public class Jio implements SIMCardInterface
{
	long phno=(long)Math.random();
	boolean isActivate=false;

	public Jio( boolean isActivate) 
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
		System.out.println("jio is a network privider");
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
