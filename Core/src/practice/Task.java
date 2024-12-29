package practice;


public abstract class Task
{
	String taskname;
	int priority;
	public abstract String completeTask();
	public abstract String displayTaskInfo();
	public String displayPriority()
	{
		return "Priority :"+priority;
	}
}
