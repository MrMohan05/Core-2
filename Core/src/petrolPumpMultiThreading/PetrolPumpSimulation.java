package petrolPumpMultiThreading;

public class PetrolPumpSimulation 
{
	public static void main(String...strings) throws InterruptedException
	{
		PetrolPump p=new PetrolPump();
		
		Car c[] = new Car[3];
		c[0]=(new Car("Car 1",p));
		c[1]=(new Car("Car 2",p));
		c[2]=(new Car("Car 3",p));
		
		Thread t[]=new Thread[3];
		t[0]=new Thread(c[0]);
		t[1]=new Thread(c[1]);
		t[2]=new Thread(c[2]);
		
		for(Thread temp:t)
		{
			temp.start();
			temp.join();
		}
	}
}
