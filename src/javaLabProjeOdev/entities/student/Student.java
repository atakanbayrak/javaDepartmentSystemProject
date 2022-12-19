package javaLabProjeOdev.entities.student;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.entities.course.Course;

public class Student {

    private String studentId;
    private String name;
    private String surname;
    private String year;
    private List<Course> registeredCourses = new ArrayList<Course>();
    
    
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
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getYear() {
		return year;
	}
	
	public List<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(Course course) {
		registeredCourses.add(course);
	}
	
	
	
    
    
}
