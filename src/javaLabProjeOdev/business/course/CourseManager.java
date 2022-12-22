package javaLabProjeOdev.business.course;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.entities.course.CourseDoctoral;
import javaLabProjeOdev.entities.course.CourseGraduate;
import javaLabProjeOdev.entities.course.CourseMaster;
import javaLabProjeOdev.entities.course.CourseUnderGraduate;
import javaLabProjeOdev.entities.lecturer.Lecturer;

public class CourseManager {

	//Static lists for courses which added from responsible person.
	static List<CourseGraduate> coursesGraduate = new ArrayList<CourseGraduate>();
	static List<CourseMaster> coursesMaster = new ArrayList<CourseMaster>();
	static List<CourseDoctoral> coursesDoctoral = new ArrayList<CourseDoctoral>();
	static List<CourseUnderGraduate> coursesUnderGraduate = new ArrayList<CourseUnderGraduate>();

	
	public CourseManager() {

	}
	
	// Adding graduate courses
	public boolean addGraduateCourse(CourseGraduate course, Lecturer lecturer) {
		if (lecturer.getCourseQuantity() < 10) {

			course.setLecturerName(lecturer.getLecturerName());
			course.setLecturerSurname(lecturer.getLecturerSurname());
			coursesGraduate.add(course);
			int quantity = lecturer.getCourseQuantity();
			lecturer.setCourseQuantity(++quantity);

			System.out.println("Lisans Kursu sistemimize eklendi");
			return true;
		} else {
			return false;
		}
	}
	
	// Adding undergraduate courses
	public boolean addUnderGraduateCourse(CourseUnderGraduate course, Lecturer lecturer) {
		if (lecturer.getCourseQuantity() < 10) {

			course.setLecturerName(lecturer.getLecturerName());
			course.setLecturerSurname(lecturer.getLecturerSurname());
			coursesUnderGraduate.add(course);
			int quantity = lecturer.getCourseQuantity();
			lecturer.setCourseQuantity(++quantity);

			System.out.println("Yüksek Lisans Kursu sistemimize eklendi");
			return true;
		} else {
			return false;
		}
	}
	
	// Adding master courses
	public boolean addMasterCourse(CourseMaster course, Lecturer lecturer) {
		if (lecturer.getCourseQuantity() < 2) {

			course.setLecturerName(lecturer.getLecturerName());
			course.setLecturerSurname(lecturer.getLecturerSurname());
			coursesMaster.add(course);
			int quantity = lecturer.getCourseQuantity();
			lecturer.setCourseQuantity(++quantity);

			System.out.println("Master Kursu sistemimize eklendi");
			return true;
		} else {
			return false;
		}
	}
	
	// Adding doctoral courses
	public boolean addDoctoralCourse(CourseDoctoral course, Lecturer lecturer) {
		if (lecturer.getCourseQuantity() < 2) {
			course.setLecturerName(course.getChefOfDoctoralStudentName());
			course.setLecturerSurname(course.getChefOfDoctoralStudentSurname());
			coursesDoctoral.add(course);
			int quantity = lecturer.getCourseQuantity();
			lecturer.setCourseQuantity(++quantity);

			System.out.println("Doktora Kursu sistemimize eklendi");
			return true;
		} else {
			return false;
		}
	}
	
	// Showing exist lists
	public List<CourseGraduate> showCoursesGraduate() {
		return coursesGraduate;
	}
	
	// Showing exist lists
	public List<CourseUnderGraduate> showCoursesUnderGraduate() {
		return coursesUnderGraduate;
	}
	
	// Showing exist lists
	public List<CourseMaster> showCoursesMaster() {
		return coursesMaster;
	}
	
	// Showing exist lists
	public List<CourseDoctoral> showCoursesDoctoral() {
		return coursesDoctoral;
	}
	
	

}
