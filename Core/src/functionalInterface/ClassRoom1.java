package functionalInterface;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class ClassRoom1 {
	int chairs;

	public int getChairs() {
		return chairs;
	}

	public void setChairs(int chairs) {
		this.chairs = chairs;
	}

	@Override
	public String toString() {
		return "ClassRoom1 [chairs=" + chairs + "]";
	}
//	public static UnaryOperator<ClassRoom1> adjustChairs(ClassRoom1 a)
//	{
//		
//		return c->{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter no of chaires :");
//			int s=sc.nextInt();
//			a.setChairs(s);
//			sc.close();
//			return a;
//			
//		};
//	}
	public static void main(String[] args) {
		ClassRoom1 c=new ClassRoom1();
		UnaryOperator<ClassRoom1> o = (a)->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no of chaires :");
			int s=sc.nextInt();
			a.setChairs(s);
			sc.close();
			return a;
			
		};
		
		o.apply(c);
		System.out.println(c);
	}
}
