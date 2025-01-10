package multiThreading;

class UserThread extends Thread
{
	public void run()
	{
//		for(int i=0;i<10;i++)
//		{
//		try {
//			UserThread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
			System.out.println("1st User Thread");
			
//		}
	}
}
class UserThread2 extends UserThread
{
	public void run()
	{
		try {
			UserThread.sleep(1000);
			super.run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2nd User Thread");
		
	}
}

public class ThreadingSleepMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		UserThread2 ut=new UserThread2();
		System.out.println("Started");
		ut.start();
		//ut.run();
		System.out.println("Compleated");
	}
}
