package practice;

//@FunctionalInterface
interface intr extends Runnable
{
	String myInterface(String a);
	int hashCode(); 
	String toString();	
}
class A implements intr 
{

	@Override
	public String myInterface(String a) {
		// TODO Auto-generated method stub
		return null;
	}
//	public String myInterface(String a) 
//	{
//		return null;
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
class Main extends A implements intr 
{
    public static void main(String [] args)
    {
    }

	
}

