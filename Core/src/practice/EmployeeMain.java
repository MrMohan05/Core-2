package practice;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		SubEmployee s=new SubEmployee("Mohan",05);
		System.out.println("Employee info :"+s.displayEmployeeInfo());
		System.out.println("Salary :"+s.calculateSalary());
		System.out.println("Pay stub :"+s.generatePayStub());
		Manager m=new Manager(5,"Mohan",05);
		System.out.println("Manager info :"+m.displayEmployeeInfo());
		System.out.println("Salary :"+m.calculateSalary());
		System.out.println("pay stub :"+m.generatePayStub());
	}
}
