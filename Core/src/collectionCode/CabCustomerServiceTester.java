package collectionCode;

public class CabCustomerServiceTester 
{
	public static void main(String[] args) 
	{
		CabCustomer c1=new CabCustomer(101, "Customer A", "Mumbai", "Chennai", 3,"9999");
		CabCustomer c2 = new CabCustomer(2,"Customer B","Pune","Delhi",10,"8888");
		CabCustomer c3 = new CabCustomer(3,"Customer C","Trivandurum","Kochi",20,"7777");
		CabCustomer c4 = new CabCustomer(4,"Customer D","Mumbai","Pune",5,"6666");
		CabCustomer c5 = new CabCustomer(5,"Customer E","Nashik","Nagpur",13,"5555");
		CabCustomerService c=new CabCustomerService(c1,c2,c3,c3,c4,c5);
		c.printBill(c1);
		c.printBill(c5);
		CabCustomer c6 = new CabCustomer(6,"Customer F","Nashik","Mumbai",15,"4444");
		c.printBill(c6);
	}
}
