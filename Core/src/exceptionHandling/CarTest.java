package exceptionHandling;

public class CarTest 
{
	public static void stop(String s) 
	{
		try
		{
		if(s.equalsIgnoreCase("stop"))
		{
			throw new CarStoppedException("Car is stop due to abnormal resoan");
		}
		System.out.println("Car is not stop due to any abnormal reason");
		}
		catch(CarStoppedException e)
		{
			System.out.println(e);
		}
	}
	public static void puncture(String s) 
	{
		try
		{
		if(s.equalsIgnoreCase("puncture"))
		{
			throw new CarPunctureException("Car is puncherd");
		}
		System.out.println("Car is not puncture and still runing");
		}
		catch(CarPunctureException e)
		{
			System.out.println(e);
		}
	}
	public static void carHeat(int n)
	{
		try
		{
		if(n>50)
		{
			throw new CarHeatException("Car is heated more the 50 degrees");
		}
		System.out.println("Car is not heated");
		}
		catch(CarHeatException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		
			stop("stop");
			System.out.println();
			puncture("puncture");
			System.out.println();
			carHeat(55);
			System.out.println();
			stop("not stoped");
			System.out.println();
			puncture("not puncture");
			System.out.println();
			carHeat(45);
	}
}
