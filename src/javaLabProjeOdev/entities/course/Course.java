package javaLabProjeOdev.entities.course;

import java.util.List;

import javaLabProjeOdev.entities.student.Student;

public class Course {
	
	// Main course class and variables
    private String courseCode;
    private String courseName;
    private int credit;
    private String courseLocation;
    private String lecturerName;
    private String lecturerSurname;
    private List<Course> courses;
    private List<Student> idInformations;

    // Course constructor
    public Course(String courseCode, String courseName, int credit, String courseLocation, List<Student> idInformations) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        this.courseLocation = courseLocation;
        this.idInformations = idInformations;
        
    }
    // Course constructor
    public Course(String courseCode, String courseName, int credit, String courseLocation) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
        this.courseLocation = courseLocation;
       
       
    }

    // Gets and sets
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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

	public List<Student> getIdInformations() {
		return idInformations;
	}

	public void setIdInformations(List<Student> idInformations) {
		this.idInformations = idInformations;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	
	
    
}
