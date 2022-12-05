package javaLabProjeOdev;

import java.util.List;

import javaLabProjeOdev.business.course.CourseManager;
import javaLabProjeOdev.entities.area.AreaCanteen;
import javaLabProjeOdev.entities.course.Course;
import javaLabProjeOdev.entities.lecturer.Lecturer;
import javaLabProjeOdev.entities.student.Student;

public class Main {

	public static void main(String[] args) {
		Lecturer lecturer = new Lecturer("1880", "Ali", "Akcayol");
		Lecturer lecturer2 = new Lecturer("1880", "Mehmet", "Akcayol");
		Student student = new Student("191180020","Sude","Ozkanoglu","Second");
		Course course = new Course("BM101","Bilgisayar Yazýlýmý",5,"Engineering Faculty");
		Course course2 = new Course("BM102","Bilgisayar Programlama",5,"Engineering Faculty");
		AreaCanteen canteen = new AreaCanteen("Kesit Cafe", "Social", "75","Hüsnü","Kacan","555 555 55 55","2016");
		
		
		CourseManager manager = new CourseManager();
		
		manager.addCourse(course, lecturer);
		manager.addCourse(course, lecturer);
		manager.addCourse(course, lecturer);
		manager.addCourse(course2, lecturer2);

		for (Course courses : manager.showCourses()) {
			System.out.println(courses.getCourseName());
			System.out.print(courses.getLecturerName()+"\t");
			System.out.println(courses.getLecturerSurname());

		}
		
		System.out.println(lecturer.getCourseQuantity());
		System.out.println(lecturer2.getCourseQuantity());
		
		
	}

	
}
