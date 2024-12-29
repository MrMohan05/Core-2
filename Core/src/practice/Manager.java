package practice;

public class Manager extends Employee
{
	int numberOfSubordinates;

	public Manager(int numberOfSubordinates,String name,int id) 
	{
		super(name,id);
		this.numberOfSubordinates = numberOfSubordinates;
	}
	@Override
	public double calculateSalary() 
	{
		return 70000;
	}

	@Override
	public String generatePayStub() 
	{
		return "Monthly sal :"+calculateSalary()+" Yearly sal :"+(12*calculateSalary());
	}
	public int getNumberOfSubordinates() 
	{
		return numberOfSubordinates;
	}
	
}
