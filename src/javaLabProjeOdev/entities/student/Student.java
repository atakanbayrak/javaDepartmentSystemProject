package javaLabProjeOdev.entities.student;

import java.util.List;

import javaLabProjeOdev.entities.course.Course;

public class Student {

    private String studentId;
    private String name;
    private String surname;
    private String year;
    private List<Course> registeredCourses;
    
    
	public Student(String studentId, String name, String surname, String year, List<Course> registeredCourses) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
		this.year = year;
		this.registeredCourses = registeredCourses;
	}
	
	public Student(String studentId, String name, String surname, String year) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
		this.year = year;
		
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
	public List<Course> getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(List<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
    
    
}
