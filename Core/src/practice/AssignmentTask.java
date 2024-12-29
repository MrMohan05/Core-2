package practice;

public class AssignmentTask extends Task
{
	String dueDate;

	public AssignmentTask(String dueDate,String taskame,int priority)
	{
		super.priority=priority;
		super.taskname=taskame;
		this.dueDate = dueDate;
	}

	@Override
	public String completeTask() 
	{
		return "Not cmpleated";
	}

	@Override
	public String displayTaskInfo() 
	{
		return "Name of the task :"+super.taskname;
	}
	public static void main(String[] args) 
	{
		AssignmentTask a=new AssignmentTask("25-jan-2025","Java", 3);
		System.out.println("Task compleation status :"+a.completeTask());
		System.out.println("Task total information :"+a.displayTaskInfo());
		System.out.println(a.displayPriority());
	}
}
