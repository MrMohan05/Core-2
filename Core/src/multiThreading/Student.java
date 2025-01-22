package multiThreading;

public class Student extends Thread
{
	EducationInstitute institue;
	String name;
	
	public Student(EducationInstitute institue, String name) 
	{
		this.institue = institue;
		this.name = name;
	}
	public void viewCoursesAndFees() throws InterruptedException
	{
		for(Course c:institue.courses) 
		{
		System.out.println("Course Name :"+c.courseName);
		System.out.println("Course ID :"+c.courseId);
		System.out.println("Course Fees :"+c.courseFee);
		System.out.println();
		sleep(500);
		}
	}
	
	public void viewOffers()
	{
		for(Offer o:institue.offernew)
		{
		System.out.println("Current Offer :"+o.getOfferText());
		System.out.println();
		}
	}
	
	public void enrollInCourse(int courseId)
	{
		institue.enrollStudentInCourse(courseId, name);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Course c1=new Course(101,"Java",27000);
		Course c2=new Course(102,"Python",21000);
		Course c3=new Course(103,"UI",17000);
		Course c[]={c1,c2,c3};
		
		Offer o1=new Offer("Special discount: Get 20% off on all courses!");
		Offer o2=new Offer("Limited time offer: Enroll in any two courses and get one course free!");
		Offer o[]= {o1,o2};
		
		EducationInstitute e=new EducationInstitute(c, o);
		
		
		
		Student s1=new Student(e, "Mohan");
		Student s2=new Student(e, "Mohan");
//		System.out.println("Course Details");
//		System.out.println("----------------------------------");
//		s1.viewCoursesAndFees();
//		System.out.println("Offer Deatils");
//		System.out.println("----------------------------------");
//		s1.viewOffers();
//		s1.enrollInCourse(101);
//		s2.enrollInCourse(104);
		Thread t1=new Thread()
				{
			public void run() {
				try {
			System.out.println("Course Details");
			sleep(500);
			System.out.println("----------------------------------");
			sleep(500);
			s1.viewCoursesAndFees();
			sleep(500);
			System.out.println("Offer Deatils");
			sleep(500);
			System.out.println("----------------------------------");
			sleep(500);
			s1.viewOffers();
			sleep(500);
			s1.enrollInCourse(101);
				}
				catch (Exception e)
					{}
			}
				};
				
		Thread t2=new Thread()
				{
			public void run() {
				try {
			System.out.println("Course Details");
			sleep(500);
			System.out.println("----------------------------------");
			sleep(500);
			s2.viewCoursesAndFees();
			sleep(500);
			System.out.println("Offer Deatils");
			sleep(500);
			System.out.println("----------------------------------");
			sleep(500);
			s2.viewOffers();
			sleep(500);
			s2.enrollInCourse(104);
			}
			catch (Exception e)
				{}
			}
				};
		t1.start();
		t1.join();
		t2.start();
		
	}
}
