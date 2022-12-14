package javaLabProjeOdev.entities.grade;

public class Grade {
	
	// Grade class variables
	private String studentId;
    private String name;
    private String surname;
    private String year;
    private String courseName;
    private String courseCode;
    private int credit;
    private String courseLocation;
    private String lecturerName;
    private String lecturerSurname;
    private String grade;
    
    // Grade class constructor
	public Grade(String studentId, String name, String surname, String year, String courseName, String courseCode,
			int credit, String courseLocation, String lecturerName, String lecturerSurname) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
		this.year = year;
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.credit = credit;
		this.courseLocation = courseLocation;
		this.lecturerName = lecturerName;
		this.lecturerSurname = lecturerSurname;
	}
    // Grade class gets and sets

	public Grade() {
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getCourseLocation() {
		return courseLocation;
	}

	public void setCourseLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}


	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public String getLecturerSurname() {
		return lecturerSurname;
	}

	public void setLecturerSurname(String lecturerSurname) {
		this.lecturerSurname = lecturerSurname;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
    
	
    
    

}
