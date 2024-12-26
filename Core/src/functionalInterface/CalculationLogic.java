package functionalInterface;

import java.util.function.Predicate;

public class CalculationLogic
{
	public static boolean testPredicate(int a,Predicate<Integer> p)
	{
		return p.test(a);
	}
	
	public static void main(String[] args) 
	{
		Predicate<Integer> isEven=(a)->
		{
			return a%2==0;
		};
		System.out.println("Is even or not :"+testPredicate(12,isEven));
		Predicate<Integer> isGreaterThanTen=(a)->
		{
			return a>10?true:false;
		};
		System.out.println("Is even or not :"+testPredicate(19,isGreaterThanTen));
		Predicate<Integer> isPrime=(a)->
		{
			int c=0;
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				return true;
			}
			return false;
		};
		System.out.println("Is even or not :"+testPredicate(13,isPrime));

	}
}
