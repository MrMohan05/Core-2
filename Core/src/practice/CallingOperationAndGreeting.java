package practice;

public class CallingOperationAndGreeting 
{
	public static void main(String[] args) 
	{
		Operation o=new Operation()
		{
			@Override
			public int perform(int a,int b)
			{
				if(a>0 && b>0)
				{
					return (a*a)+(b*b);
				}
				return a+b;
			}
		};
		System.out.println(o.perform(4, 3));
		Greeting g=new Greeting()
		{
			@Override
			public void greet(String name,int age)
			{
				if(age>=18)
				{
					System.out.println("Greeting the person as Adult");
				}
				else if(name.length()>5 && age<18)
				{
					System.out.println("Greeting name of the person is long but he is not Adult");
				}
				else
				{
					System.out.println("Greeting as a normal person");
				}
			}
		};
		g.greet("Virat",38);
	}
}
