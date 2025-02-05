package collectionCode;

import java.util.ArrayList;

public class CabCustomerService 
{
	ArrayList<CabCustomer> a1=new ArrayList<>();
	
	public CabCustomerService(CabCustomer... c1) 
	{
		for(CabCustomer x:c1)
		{
			a1.add(x);
		}
	}
	
	public int addCabCustomer(CabCustomer c)
	{
		ArrayList<CabCustomer> num=a1;
		for(CabCustomer i : num)
		{
			if(i.phone.equals(c.phone))
			{
				System.out.println("Number is already present in the system");
				if(c.getDistance()<=4)
					return 80;
				else
				{
					return ((c.getDistance()-4)*6)+80;
				}
			}
		}
		return 0;
	}
	public void printBill(CabCustomer c)
	{
		int n=addCabCustomer(c);
		if(n==0) {System.out.println("Customer is new"); return;}
		System.out.println(c.getCustomerName()+" please pay your bill "+n);
	}
}
