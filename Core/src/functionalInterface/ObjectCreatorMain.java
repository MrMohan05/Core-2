package functionalInterface;

public class ObjectCreatorMain 
{
	public static void main(String[] args)
	{
		 ObjectCreator creator = (id, name) -> new Student(id, name);
		 Student student = (Student) creator.create(1, "John Doe");
		 java.util.function.Consumer<String> nameUpdater = (currentName) ->
		 {
	        student.setName(currentName + " Jr.");
	     };
	     student.updateName(nameUpdater);
	     System.out.println(student);
	}
}
