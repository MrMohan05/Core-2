package multiThreading;

class Test2 extends Thread
{
	volatile int a;
	public void run() {
		a++;
	}
}
public class VoletileVariabel
{
	public static void main(String[] args) throws InterruptedException {
		Test2 test = new Test2();
		test.run();
		System.out.println(test.a);
		test.start();
		test.sleep(500);
		System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}
