package interfacePrograms;

public class SimpleCalculator implements Calculator
{
	public static void main(String[] args)
	{
		SimpleCalculator c=new SimpleCalculator();
		c.calculateSum(1,1,1,1,1);
	}

	@Override
	public void calculateSum(int... a) 
	{
		int sum=0;
		for(int s:a)
		{
			sum+=s;
		}
		System.out.println("Sum is : "+sum);
	}
}
