package multiThreading;

class Railway implements Runnable
{
	int seats=4;
	int req;
	@Override
	public void run()
	{
		System.out.println(check());
	}
	String check()
	{
		if(seats>=req)
		{
			seats-=req;
			return "Seats are availabe and reserved for :"+Thread.currentThread().getName();
		}
		else
			return "Seats are not availabe for :"+Thread.currentThread().getName();
	}
	Railway(int req)
	{
		this.req=req;
	}
}

public class DrawbacksOfMultithreading 
{
	public static void main(String[] args) {
		Railway r1=new Railway(4);
		Railway r2=new Railway(4);
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
	}
	
}
