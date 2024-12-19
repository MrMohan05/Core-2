package practice;

import java.util.Scanner;

public class SecondLargestWithoutArray 
{
	public static void main(String[] args) 
	{
		int n,s,m=0,o=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements you want :");
		s=sc.nextInt();
		System.out.println("Enter elements one by one :");
		for(int i=0;i<s;i++)
		{
			n=sc.nextInt();
			if(n>=m)
			{
				o=m;
				m=n;
				
				System.out.println(" m="+m);
			}
			else if(n<=m && n>=o)
			{
				o=n;
				System.out.println(" o "+o);
			}
			System.out.println("n="+n+" m="+m+" o="+o);
		}
		if(m==o || s==1)
		{
			System.out.println("All numbers are same");
			System.exit(0);
		}
		System.out.println("Largest elemnt is : "+m);
		System.out.println("Second largest : "+o);
		sc.close();
	}
}
