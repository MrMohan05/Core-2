package userDefinedException;

public class ShoppingApplication 
{
	public static void main(String[] args)
	{
		Product p1=new Product(101,10, "ABC",5000);
		Product p2=new Product(102,10, "DEF",6000);
		Product p3=new Product(103,10, "GHI",7000);
		Product p4=new Product(104,10, "JKL",8000);
		Product p5=new Product(105,10, "MNO",9000);
		ShoppingCart s=new ShoppingCart(5);
		s.addToCart(p1, 10);
		System.out.println("Total price :"+s.calculateTotal());
		s.addToCart(p2, 5);
		System.out.println("Total price :"+s.calculateTotal());
		s.addToCart(p3, 5);
		System.out.println("Total price :"+s.calculateTotal());
		s.addToCart(p4, 2);
		System.out.println("Total price :"+s.calculateTotal());
		s.addToCart(p5, 1);
		System.out.println("Total price :"+s.calculateTotal());
	}
}
