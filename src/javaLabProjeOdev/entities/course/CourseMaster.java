package javaLabProjeOdev.entities.course;

import java.util.List;

public class CourseMaster extends CourseGraduate{

	private float minCourseThesisBound;
	private List<String> academicFieldPredictions;
	public CourseMaster(String courseCode, String courseName, int credit, String courseLocation, List<String> academicFieldPredictions, float minCourseThesisBound) {
		super(courseCode, courseName, credit, courseLocation);
		// TODO Auto-generated constructor stub
		this.minCourseThesisBound = minCourseThesisBound;
		this.academicFieldPredictions = academicFieldPredictions;
	}
	
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
