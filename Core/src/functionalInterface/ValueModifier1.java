package functionalInterface;

import java.util.function.Consumer;

public class ValueModifier1 
{
	public static void modifyValue(int a,Consumer<Integer> c)
	{
		c.accept(a);
	}
	public static void main(String[] args) {
		Consumer<Integer> doubleValue=(n)->
		{
			System.out.println("Double value is :"+(n+n));
		};
		Consumer<Integer> incrementBy=(n)->
		{
			System.out.println("Increment by 3 :"+n*3);
		};
		Consumer<Integer> squareValue=(n)->
		{
			System.out.println("Squre vale is :"+n*n);
		};
		modifyValue(5, doubleValue);
		modifyValue(5, incrementBy);
		modifyValue(5, squareValue);
	}
}
