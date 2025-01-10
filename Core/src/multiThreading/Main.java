package multiThreading;

public class Main extends Thread {

    public static void main(String[] args) throws Exception {
    Main t1 = new Main();
    Main t2 = new Main();
    t1.setName("Mohan");
    t2.setName("Mohan");
    
    t1.start();
    t1.wait(1000);
    t2.start();
    
    }

    public void run() {
    	System.out.println("Threas name :"+Thread.currentThread().getName());
    	System.out.println("Thread id :"+Thread.currentThread().getId());
    }

    public void method() {
	hello();
    System.out.println("method");
}

public void hello()
	{
	hello1();
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}