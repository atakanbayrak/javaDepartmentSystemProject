package javaLabProjeOdev.business.course;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.entities.course.Course;
import javaLabProjeOdev.entities.lecturer.Lecturer;

public class CourseManager {
	
	List<Course> courses = new ArrayList<Course>();
	
	public CourseManager() {
		
	}
	
	public boolean addCourse(Course course, Lecturer lecturer) {
		
		if(lecturer.getCourseQuantity() < 2) {
			
			course.setLecturerName(lecturer.getLecturerName());
			course.setLecturerSurname(lecturer.getLecturerSurname());
			courses.add(course);
			int quantity = lecturer.getCourseQuantity();
			lecturer.setCourseQuantity(++quantity);
			
			System.out.println("Kurs sistemimize eklendi");
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	public void updateCourse(Course course) {
		
	}
	
	public void deleteCourse(Course course) {
		
	}
	
	public List<Course> showCourses(){
		return courses;
	}

}
