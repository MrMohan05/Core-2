package userDefinedException;

public class ShoppingCart 
{
	int itemCount;
	Product cartItems[];
	
	public ShoppingCart(int size)
	{
		cartItems = new Product[size];		//5
	}
	
	public void addToCart(Product p,int qyt)
	{
		cartItems[itemCount++]=p;	
		try 
		{
			p.decreaseQuantity(qyt);
			System.out.println("Valid quatity and it is deducted current quantity :"+p.qyt);
		} 
		catch (InsufficientQuantityException e) 
		{
			e.printStackTrace();
		}
	}
	public double calculateTotal()
	{
		double sum=0;
		
		for(Product p:cartItems)
		{
			if(p!=null)
			sum+=p.price;
		}
		return sum;
	}
	
	
}
