package javaLabProjeOdev.entities.student;

public class StudentUnderGraduate extends Student{

	// StudentUnderGraduate class which is sub class of Student variables
	private String highSchoolName;
	private String highSchoolGraduateRate;
	private String universityExamResultPoint;
	
	// StudentUnderGraduate class which is sub class of Student constructor
	public StudentUnderGraduate(String studentId, String name, String surname, String year,String highSchoolName,String highSchoolGraduateRate,String universityExamResultPoint) {
		super(studentId, name, surname, year);
		this.highSchoolName = highSchoolName;
		this.highSchoolGraduateRate = highSchoolGraduateRate;
		this.universityExamResultPoint = universityExamResultPoint;
	}
	
	// StudentUnderGraduate class which is sub class of Student gets and sets
	public String getHighSchoolName() {
		return highSchoolName;
	}
	public void setHighSchoolName(String highSchoolName) {
		this.highSchoolName = highSchoolName;
	}
	public String getHighSchoolGraduateRate() {
		return highSchoolGraduateRate;
	}
	public void setHighSchoolGraduateRate(String highSchoolGraduateRate) {
		this.highSchoolGraduateRate = highSchoolGraduateRate;
	}
	public String getUniversityExamResultPoint() {
		return universityExamResultPoint;
	}
	public void setUniversityExamResultPoint(String universityExamResultPoint) {
		this.universityExamResultPoint = universityExamResultPoint;
	}
	
	

}
