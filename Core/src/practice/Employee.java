package practice;

public abstract class Employee 
{
	String name;
	int id;
	
	public Employee(String name, int id) 
	{
		this.name = name;
		this.id = id;
	}
	public abstract double calculateSalary();
	public abstract String generatePayStub();
	public String displayEmployeeInfo()
	{
		return "Name :"+name+" Id :"+id;
	}
}
