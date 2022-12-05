package javaLabProjeOdev.entities.course;

public class CourseDoctoral extends Course{
	
	private boolean isCourseNeedThesisForSuccess;
	private String chefOfDoctoralStudentName;
	private String chefOfDoctoralStudentSurname;
	public CourseDoctoral(String courseCode, String courseName, int credit, String courseLocation,boolean isCourseNeedThesisForSuccess,String chefOfDoctoralStudentName,String chefOfDoctoralStudentSurname) {
		super(courseCode, courseName, credit, courseLocation);
		// TODO Auto-generated constructor stub
		this.isCourseNeedThesisForSuccess = isCourseNeedThesisForSuccess;
		this.chefOfDoctoralStudentName = chefOfDoctoralStudentName;
		this.chefOfDoctoralStudentSurname = chefOfDoctoralStudentSurname;
	}

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
