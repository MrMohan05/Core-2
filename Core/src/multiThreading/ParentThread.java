package multiThreading;

public class ParentThread implements Runnable
{
	static ParentThread p1=new ParentThread();
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException 
	{
		Thread.currentThread().sleep(1000);
		Thread t1=new Thread(p1);
		t1.setPriority(10);
		t1.start();
	}
	public void run()
	{
		System.out.println("Name :"+Thread.currentThread().getName());
		System.out.println("Name :"+Thread.currentThread().getPriority());
		Thread t2=new Thread(()->
		{
			System.out.println("Name :"+Thread.currentThread().getName());
			System.out.println("Name :"+Thread.currentThread().getPriority());
		},"Mohan");
		t2.start();
	}
}
