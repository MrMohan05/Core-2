package multiThreading;

import java.util.*;
class Test4 extends Thread
{
    volatile boolean  a;
    @Override
	public void run() {
    	System.out.println("Enter the Boolean value:");
    	Scanner sc = new Scanner(System.in);
	boolean b=sc.nextBoolean();
	m1(b);
	}
	public void m1(boolean b)
	{
	    a=b;
	}
}
public class Main3
{
	public static void main(String[] args) throws InterruptedException {
		Test4 test = new Test4();
		Test4 test2 = new Test4();
 		test.run();
		System.out.println("Normal: "+test.a);
		test.start();
		test.sleep(4000);
//		test.join();
//		test2.start();
//		test2.join();
 		
// 		test.join();
		System.out.println("Test "+test.a);
//		System.out.println("Test 2"+test2.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}
