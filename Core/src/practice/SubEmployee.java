package practice;

public class SubEmployee extends Employee
{

	public SubEmployee(String name,int id)
	{
		super(name,id);
	}

	@Override
	public double calculateSalary() 
	{
		return 50000;
	}

	@Override
	public String generatePayStub() 
	{
		return "Monthly sal :"+calculateSalary()+" Yearly sal :"+(12*calculateSalary());
	}

}
