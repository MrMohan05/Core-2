package interfacePrograms;

public class BSNL implements SIMCardInterface 
{
	long phno=(long)Math.random()*963852;
	boolean isActivate=false;
	public BSNL( boolean isActivate) 
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
