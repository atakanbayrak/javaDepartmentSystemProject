package javaLabProjeOdev.entities.student;

public class StudentGraduate extends Student{

	// StudentGraduate class which is sub class of Student variables
	private String graduateYear;
	private boolean isWorkInAnotherCompany;
	private float graduateExamResult;
	// StudentGraduate class which is sub class of Student constructor

	public StudentGraduate(String studentId, String name, String surname, String year,String graduateYear,boolean isWorkInAnotherCompany,float graduateExamResult) {
		super(studentId, name, surname, year);
		// TODO Auto-generated constructor stub
		this.graduateYear = graduateYear;
		this.isWorkInAnotherCompany = isWorkInAnotherCompany;
		this.graduateExamResult = graduateExamResult;
	}
	
	// StudentGraduate class which is sub class of Student gets and sets

	public String getGraduateYear() {
		return graduateYear;
	}
	public void setGraduateYear(String graduateYear) {
		this.graduateYear = graduateYear;
	}
	public boolean isWorkInAnotherCompany() {
		return isWorkInAnotherCompany;
	}
	public void setWorkInAnotherCompany(boolean isWorkInAnotherCompany) {
		this.isWorkInAnotherCompany = isWorkInAnotherCompany;
	}
	public float getGraduateExamResult() {
		return graduateExamResult;
	}
	public void setGraduateExamResult(float graduateExamResult) {
		this.graduateExamResult = graduateExamResult;
	}

	
	
	
}
