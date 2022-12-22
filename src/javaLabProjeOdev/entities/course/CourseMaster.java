package javaLabProjeOdev.entities.course;

import java.util.List;

public class CourseMaster extends CourseGraduate{

	// CourseGraduate subclass which is CourseMaster variables
	private float minCourseThesisBound;
	private List<String> academicFieldPredictions;
	
	// Constructor
	public CourseMaster(String courseCode, String courseName, int credit, String courseLocation, List<String> academicFieldPredictions, float minCourseThesisBound) {
		super(courseCode, courseName, credit, courseLocation);
		this.minCourseThesisBound = minCourseThesisBound;
		this.academicFieldPredictions = academicFieldPredictions;
	}
	
	// Gets and sets
	public float getMinCourseThesisBound() {
		return minCourseThesisBound;
	}
	public void setMinCourseThesisBound(float minCourseThesisBound) {
		this.minCourseThesisBound = minCourseThesisBound;
	}
	public List<String> getAcademicFieldPredictions() {
		return academicFieldPredictions;
	}
	public void setAcademicFieldPredictions(List<String> academicFieldPredictions) {
		this.academicFieldPredictions = academicFieldPredictions;
	}
	
	

}
