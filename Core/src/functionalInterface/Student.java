package functionalInterface;

import java.util.function.Consumer;

public class Student 
{
	private int id; 
	private String name;
	public Student(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	void updateName(Consumer<String> nameUpdater)
	{
		nameUpdater.accept(name);	
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
	 
}
