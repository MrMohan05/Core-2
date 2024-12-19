package practice;

import java.util.Scanner;

public class CheackInOrderOrNot 
{
	public static void main(String[] args) 
	{
		int n,m=0,s=0,second=0,c=0,missing=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size :");
		s=sc.nextInt();
		System.out.println("Enter numbers : ");
		for(int i=0;i<s;i++)
		{
			second=m;
			n=sc.nextInt();
			m=n;
			if(m!=(second+1) && i>0 && second!=n && c==0)
			{
				missing=second+1;
				c++;
			}
			if(second>n)
			{
				System.out.println("Decrising order not allowed");
				System.exit(0);
			}
			if(c==0 && i==(s-1))
			{
				System.out.println(n+1);
			}
		}
		System.out.println("First missing "+(missing));
		sc.close();
	}
}
