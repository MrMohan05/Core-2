package multiThreading;

public class EducationInstitute 
{
	Course []courses;
	Offer []offernew ;
	
	public EducationInstitute(Course[] courses, Offer[] offernew) 
	{
		this.courses = courses;
		this.offernew = offernew;
	}

	public Course[] getCourses() 
	{
		return courses;
	}

	public Offer[] getOffernew() 
	{
		return offernew;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		boolean valid=false;
		for(Course c:courses)
		{
			if(courseId==c.getCourseId())
				valid=true;
				
		}
		if(valid)System.out.println("Student enrolled");
		else System.out.println("Student not enrolled ID not matched");
	}
	
	
}
