package javaLabProjeOdev.business.course;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.entities.course.Course;
import javaLabProjeOdev.entities.course.CourseDoctoral;
import javaLabProjeOdev.entities.course.CourseGraduate;
import javaLabProjeOdev.entities.course.CourseMaster;
import javaLabProjeOdev.entities.course.CourseUnderGraduate;
import javaLabProjeOdev.entities.lecturer.Lecturer;

public class CourseManager {

	List<CourseGraduate> coursesGraduate = new ArrayList<CourseGraduate>();
	List<CourseMaster> coursesMaster = new ArrayList<CourseMaster>();
	List<CourseDoctoral> coursesDoctoral = new ArrayList<CourseDoctoral>();
	List<CourseUnderGraduate> coursesUnderGraduate = new ArrayList<CourseUnderGraduate>();

	public CourseManager() {

	}

	public boolean addGraduateCourse(CourseGraduate course, Lecturer lecturer) {
		if (lecturer.getCourseQuantity() < 2) {

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
	
	public boolean addUnderGraduateCourse(CourseUnderGraduate course, Lecturer lecturer) {
		if (lecturer.getCourseQuantity() < 2) {

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

	public List<CourseGraduate> showCoursesGraduate() {
		return coursesGraduate;
	}
	
	public List<CourseUnderGraduate> showCoursesUnderGraduate() {
		return coursesUnderGraduate;
	}
	
	public List<CourseMaster> showCoursesMaster() {
		return coursesMaster;
	}
	
	public List<CourseDoctoral> showCoursesDoctoral() {
		return coursesDoctoral;
	}
	
	

}
