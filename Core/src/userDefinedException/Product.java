package userDefinedException;

public class Product 
{
	int id;
	int qyt;
	String name;
	double price;
	
	public Product(int id,int qyt,String name,double price)
	{
		this.id=id;
		this.qyt=qyt;
		this.name=name;
		this.price=price;
	}
	
	public void decreaseQuantity(int qyt) throws InsufficientQuantityException
	{
		if(this.qyt<qyt)
		{
			throw new InsufficientQuantityException("Quantity");
		}
		this.qyt-=qyt;
	}
}
