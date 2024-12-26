package functionalInterface;

import java.util.function.Function;

public class FunctionApplier1 {
	public static int applyFunction(int a,Function<Integer, Integer> f)
	{
		return f.apply(a);
	}
	public static void main(String[] args) {
		Function<Integer, Integer> add=(n)->
		{
			return n+5;
		};
		Function<Integer, Integer> multiply=n->
		{
			return n*2;
		};
		Function<Integer, Integer> subtract=n->
		{
			return n-3;
		};
		System.out.println("After adding 5:"+applyFunction(-15,add));
		System.out.println("After multiplying by 2:"+applyFunction(-15, multiply));
		System.out.println("After substractiong 3:"+applyFunction(-15, subtract));
	}
}
