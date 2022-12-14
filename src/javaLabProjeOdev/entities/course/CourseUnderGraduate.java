package javaLabProjeOdev.entities.course;

public class CourseUnderGraduate extends Course{

	// Course subclass which is CourseUnderGraduate variables
	private String courseDegreeYear;
	private boolean isCourseBonded;
	
	// Constructor
	public CourseUnderGraduate(String courseCode, String courseName, int credit, String courseLocation,String lecturerInformation, String courseDegreeYear,boolean isCourseBonded) {
		super(courseCode, courseName, credit, courseLocation);
		// TODO Auto-generated constructor stub
		this.courseDegreeYear = courseDegreeYear;
		this.isCourseBonded = isCourseBonded;
	}

	// Gets and sets
	public String getCourseDegreeYear() {
		return courseDegreeYear;
	}

	public void setCourseDegreeYear(String courseDegreeYear) {
		this.courseDegreeYear = courseDegreeYear;
	}

	public boolean isCourseBonded() {
		return isCourseBonded;
	}

	public void setCourseBonded(boolean isCourseBonded) {
		this.isCourseBonded = isCourseBonded;
	}
	
	

}
