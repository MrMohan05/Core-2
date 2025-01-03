package recordclass;

public record Record1(int id,String name) 
{
	
	static{System.out.println(Record1.r1);System.out.println("Hello");}
	public Record1
	{
		if(id<=0)throw new IllegalArgumentException();
		if(name==null)throw new NullPointerException();
	}
	static String add(Record1 r1,Record1 r2)
	{
		
		return r1.id+" "+r2.id;
	}
	static Record1 r1=new Record1(11, "Emp1");
	static{System.out.println("Hello");}
	public static void main(String[] args) {
		
		System.out.println(r1);
		Record1 r2=new Record1(22, "Emp2");
		System.out.println(r2);
		System.out.println(add(r1,r2));
	}
}
