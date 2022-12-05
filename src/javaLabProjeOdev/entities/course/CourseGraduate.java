package javaLabProjeOdev.entities.course;

public class CourseGraduate extends Course{

	private String courseField;
	private float courseCapability;
	public CourseGraduate(String courseCode, String courseName, int credit, String courseLocation,String lecturerInformation, String courseField, float courseCapability) {
		super(courseCode, courseName, credit, courseLocation);
		// TODO Auto-generated constructor stub
		this.courseField = courseField;
		this.courseCapability = courseCapability;
	}
	
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
