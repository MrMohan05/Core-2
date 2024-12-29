package practice;

public class Main_Set_c
{
	public static void main(String[] args)
	{
		BooleanOperation b=new BooleanOperation()
		{
			@Override
			public boolean evaluate(int a, int b) 
			{
				if(a%3==0 && b%5==0 && (a+b)%2==0)
				{
					return true;
				}
				return false;
			}			
		};
		DoubleFunction d=new DoubleFunction()
		{
			@Override
			public double calculate(double x, double y)
			{
				if(x>0 && y<0 && x%2==0)
				{
					if(y!=0)
					{
						return (x*x*x)/y;
					}
					else 
					{
						return 1;
					}
				}
				else if(x<0 && y>0 && y%2!=0)
				{
					return x*x*y*y;
				}
				return x+y;
			}
		};
		System.out.println("Boolean test :"+b.evaluate(9, 15));
		System.out.println("Double test :"+d.calculate(-6.0, 3.0));
	}
}
