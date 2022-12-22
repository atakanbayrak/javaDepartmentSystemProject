package javaLabProjeOdev.entities.course;

public class CourseDoctoral extends CourseGraduate{
	
	// CourseGraduate subclass which is CourseDoctoral variables
	private boolean isCourseNeedThesisForSuccess;
	private String chefOfDoctoralStudentName;
	private String chefOfDoctoralStudentSurname;
	
	// Constructor
	public CourseDoctoral(String courseCode, String courseName, int credit, String courseLocation,boolean isCourseNeedThesisForSuccess,String chefOfDoctoralStudentName,String chefOfDoctoralStudentSurname) {
		super(courseCode, courseName, credit, courseLocation);
		this.isCourseNeedThesisForSuccess = isCourseNeedThesisForSuccess;
		this.chefOfDoctoralStudentName = chefOfDoctoralStudentName;
		this.chefOfDoctoralStudentSurname = chefOfDoctoralStudentSurname;
	}

	// Gets and sets
	public boolean isCourseNeedThesisForSuccess() {
		return isCourseNeedThesisForSuccess;
	}

	public void setCourseNeedThesisForSuccess(boolean isCourseNeedThesisForSuccess) {
		this.isCourseNeedThesisForSuccess = isCourseNeedThesisForSuccess;
	}

	public String getChefOfDoctoralStudentName() {
		return chefOfDoctoralStudentName;
	}

	public void setChefOfDoctoralStudentName(String chefOfDoctoralStudentName) {
		this.chefOfDoctoralStudentName = chefOfDoctoralStudentName;
	}

	public String getChefOfDoctoralStudentSurname() {
		return chefOfDoctoralStudentSurname;
	}

	public void setChefOfDoctoralStudentSurname(String chefOfDoctoralStudentSurname) {
		this.chefOfDoctoralStudentSurname = chefOfDoctoralStudentSurname;
	}
	
	

}
