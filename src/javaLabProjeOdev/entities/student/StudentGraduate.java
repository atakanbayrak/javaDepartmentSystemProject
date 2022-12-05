package javaLabProjeOdev.entities.student;

public class StudentGraduate extends Student{

	private String graduateYear;
	private boolean isWorkInAnotherCompany;
	private float graduateExamResult;
	public StudentGraduate(String studentId, String name, String surname, String year,String graduateYear,boolean isWorkInAnotherCompany,float graduateExamResult) {
		super(studentId, name, surname, year);
		// TODO Auto-generated constructor stub
		this.graduateYear = graduateYear;
		this.isWorkInAnotherCompany = isWorkInAnotherCompany;
		this.graduateExamResult = graduateExamResult;
	}
	
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
