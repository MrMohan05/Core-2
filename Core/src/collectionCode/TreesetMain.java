package collectionCode;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetMain
{
	public static void main(String[] args) 
	{
		System.out.println("In acending order");
		TreeSet<Product> t1=new TreeSet<Product>((p1,p2)->p1.pid().compareTo(p2.pid()));
		t1.add(new Product(102,"P1"));
		t1.add(new Product(103,"P2"));
		t1.add(new Product(101,"P3"));
		
		System.out.println(t1);
		
		
		System.out.println("\nIn decending order");
		Comparator<Product> c2= ((p1,p2)->
				{
			return p2.pid().compareTo(p1.pid());
				});
		TreeSet<Product> t2=new TreeSet<>(c2);
		t2.add(new Product(102, "P1"));
		t2.add(new Product(103, "P2"));
		t2.add(new Product(101, "P3"));
		
		System.out.println(t2);		
		
		
		System.out.println("\nSorting based on Alphabeticl order");
		TreeSet<Product> t3=new TreeSet<Product>((p1,p2)->p1.pname().compareTo(p2.pname()));
		t3.add(new Product(101,"Monkey"));
		t3.add(new Product(102,"Zebra"));
		t3.add(new Product(103,"Ape"));
		
		System.out.println(t3);
		
		System.out.println("\nSorting by name is reverse order");
		Comparator<Product> c4=((p1,p2)->
				{
			return p2.pname().compareTo(p1.pname());
				});
		TreeSet<Product> t4=new TreeSet<Product>(c4);
		t4.add(new Product(101,"Monkey"));
		t4.add(new Product(102,"Zebra"));
		t4.add(new Product(103,"Ape"));
		
		System.out.println(t4);
	}
}




















