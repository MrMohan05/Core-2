package functionalInterface;
import java.util.function.Consumer;

interface ObjectCreator1
{
	public Object create(int id, String name);
}

class Student1
{
	private int id; 
	private String name;
	public Student1(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	 @Override
	 public String toString() 
	 {
	    return "Student { id=" + id + ", name='" + name + "' }";
	 }
	public void setName(String string) 
	{
		name=string;
	}
	void updateName(Consumer<String> nameUpdater) 
	{
		nameUpdater.accept("New name");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
}
public class ObjectCreatorMain1 
{
	public static void main(String[] args)
	{
		Student1 s=new Student1(1,"Mohan");
		ObjectCreator1 obj=(id,name)->
		{
			return new Student1(id,name);
		};
		System.out.println(s);
		obj.create(s.getId(),s.getName());
		Consumer<String> c=(str)->
		{
			s.setName(str);
		};
		s.updateName(c);
		System.out.println(s);
	}
}
