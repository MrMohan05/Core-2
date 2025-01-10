package multiThreading;

public class fjei implements Runnable
{
	Thread thread;
	public fjei() {
		thread = new Thread(this);
		thread.stop();
	}
	public void run() {
		System.out.println(thread);
		
	}	
	public static void main(String[] args) {
		new fjei();
		
	}
}
