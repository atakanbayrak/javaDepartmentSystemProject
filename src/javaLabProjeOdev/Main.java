package javaLabProjeOdev;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.business.course.CourseManager;
import javaLabProjeOdev.business.student.StudentManager;
import javaLabProjeOdev.entities.area.AreaCanteen;
import javaLabProjeOdev.entities.course.Course;
import javaLabProjeOdev.entities.course.CourseDoctoral;
import javaLabProjeOdev.entities.course.CourseMaster;
import javaLabProjeOdev.entities.lecturer.Lecturer;
import javaLabProjeOdev.entities.student.Student;
import javaLabProjeOdev.entities.student.StudentDoctoral;

public class Main {

	public static void main(String[] args) {
		
		List<String> masterCoursesPredictions = new ArrayList<String>();
		
		masterCoursesPredictions.add("Computer Science");
		masterCoursesPredictions.add("Computer Architecture");
		
		Lecturer lecturer = new Lecturer("1880", "Ali", "Akcayol");
		Lecturer lecturer2 = new Lecturer("1880", "Mehmet", "Akcayol");
		
		StudentDoctoral studentDoctoral = new StudentDoctoral("191180020","Sude","Ozkanoglu","Second","Computer Science",true,4);
		
		CourseDoctoral course = new CourseDoctoral("BM101","Bilgisayar Yazýlýmý",5,"Engineering Faculty",true,"Oktay","Yýldýz");
		CourseMaster course2 = new CourseMaster("BM102","Bilgisayar Programlama",5,"Engineering Faculty",masterCoursesPredictions, 5);
		
		
		
		CourseManager manager = new CourseManager();
		StudentManager studentManager = new StudentManager();
		
		
		manager.addMasterCourse(course2, lecturer);
		manager.addDoctoralCourse(course, lecturer2);
		
		for (CourseMaster courses : manager.showCoursesMaster()) {
			System.out.println(courses.getCourseName());
			System.out.print(courses.getLecturerName()+"\t");
			System.out.println(courses.getLecturerSurname());
			System.out.println(courses.getAcademicFieldPredictions());
		}
		
		System.out.println(lecturer.getCourseQuantity());
		System.out.println(lecturer2.getCourseQuantity());
		
		studentManager.addDoctoralStudent(studentDoctoral);
		for (StudentDoctoral studentsDoctoral : studentManager.showStudentsDoctoral()) {
			System.out.println(studentsDoctoral.getName());
			System.out.println(studentsDoctoral.getSurname());
		}
	}

	
}
