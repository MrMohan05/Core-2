package practice2;

public class CheackingInitCause 
{
	int a=10;
	public static void main(String[] args) 
	{
		CheackingInitCause c=new CheackingInitCause();
		c.disp();
		Exception e=new Exception();
		//e.initCause(new ArithmeticException());
		e.initCause(e);
	}
	void disp()
	{
		System.out.println(this);
		System.out.println(this.a);
	}
}
