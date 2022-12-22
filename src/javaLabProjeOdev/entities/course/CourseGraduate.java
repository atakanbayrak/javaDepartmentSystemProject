package javaLabProjeOdev.entities.course;

public class CourseGraduate extends Course{

	// Course subclass which is CourseGraduate variables
	private String courseField;
	private float courseCapability;
	
	// Constructor
	public CourseGraduate(String courseCode, String courseName, int credit, String courseLocation,String lecturerInformation, String courseField, float courseCapability) {
		super(courseCode, courseName, credit, courseLocation);
		// TODO Auto-generated constructor stub
		this.courseField = courseField;
		this.courseCapability = courseCapability;
	}
	

	public CourseGraduate(String courseCode, String courseName, int credit, String courseLocation) {
		super(courseCode, courseName, credit, courseLocation);
	}


	// Gets and sets
	public String getCourseField() {
		return courseField;
	}
	public void setCourseField(String courseField) {
		this.courseField = courseField;
	}
	public float getCourseCapability() {
		return courseCapability;
	}
	public void setCourseCapability(float courseCapability) {
		this.courseCapability = courseCapability;
	}

	
}
