package javaLabProjeOdev;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.business.certificate.CertificateManager;
import javaLabProjeOdev.business.course.CourseManager;
import javaLabProjeOdev.business.grade.GradeManager;
import javaLabProjeOdev.business.lecturer.LecturerManager;
import javaLabProjeOdev.business.secretary.SecretaryManager;
import javaLabProjeOdev.business.student.StudentManager;
import javaLabProjeOdev.entities.area.AreaCanteen;
import javaLabProjeOdev.entities.course.Course;
import javaLabProjeOdev.entities.course.CourseDoctoral;
import javaLabProjeOdev.entities.course.CourseGraduate;
import javaLabProjeOdev.entities.course.CourseMaster;
import javaLabProjeOdev.entities.grade.Grade;
import javaLabProjeOdev.entities.lecturer.Lecturer;
import javaLabProjeOdev.entities.staff.StaffSecretary;
import javaLabProjeOdev.entities.student.Student;
import javaLabProjeOdev.entities.student.StudentDoctoral;
import javaLabProjeOdev.entities.student.StudentGraduate;

public class Main {

	public static void main(String[] args) {

		List<String> masterCoursesPredictions = new ArrayList<String>();
		LecturerManager lecturerManager = new LecturerManager();
		
		CertificateManager certificateManager = new CertificateManager();
		CourseManager manager = new CourseManager();
		StudentManager studentManager = new StudentManager();
		GradeManager gradeManager = new GradeManager();
		Lecturer lecturer = new Lecturer("1880", "Ali", "Akcayol");
		Lecturer lecturer2 = new Lecturer("1880", "Mehmet", "Akcayol");
		Lecturer lecturer3 = new Lecturer("1895", "Osman", "Karayel");
		masterCoursesPredictions.add("Computer Science");
		masterCoursesPredictions.add("Computer Architecture");
		

		StudentDoctoral studentDoctoral = new StudentDoctoral("191180020", "Sude", "Ozkanoglu", "Second",
				"Computer Science", true, 4);
		CourseDoctoral course = new CourseDoctoral("BM101", "Bilgisayar Yazýlýmý", 5, "Engineering Faculty", true,
				"Oktay", "Yýldýz");
		CourseMaster course2 = new CourseMaster("BM102", "Bilgisayar Programlama", 5, "Engineering Faculty",
				masterCoursesPredictions, 5);
		CourseGraduate course3 = new CourseGraduate("BM103", "Graudate Programlama", 5, "Engineering Faculty",
				"Ahmet Kayak","Computer Science", 5);
		
		
		
		manager.addMasterCourse(course2, lecturer);
		manager.addDoctoralCourse(course, lecturer2);
		manager.addGraduateCourse(course3, lecturer3);

		for (CourseMaster courses : manager.showCoursesMaster()) {
			System.out.println(courses.getCourseName());
			System.out.print(courses.getLecturerName() + "\t");
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

		// Üniversite head of department ayarlama
		System.out.println(lecturerManager.chooseHeadOfDepartment(lecturer));
		System.out.println(lecturerManager.getChooseHeadOfDepartment().getLecturerName());
		certificateManager.giveCertificate(lecturerManager, lecturer, null);
		
		// Öðrenci derslerini ekleme
		StudentGraduate graduate = new StudentGraduate("1","Atakan","Bayrak","2017","2019",true,3);
		graduate.setRegisteredCourses(course3);
		studentDoctoral.setRegisteredCourses(course2);
		
		for (Course courses : graduate.getRegisteredCourses()) {
			System.out.println(courses.getCourseName());
			System.out.print(courses.getLecturerName() + "\t");
			System.out.println(courses.getLecturerSurname());
			System.out.println();
		}
		
		for (Course courses : studentDoctoral.getRegisteredCourses()) {
			System.out.println(courses.getCourseName());
			System.out.print(courses.getLecturerName() + "\t");
			System.out.println(courses.getLecturerSurname());
			System.out.println();
		}
		
		// Sekreter lecturer degistirme
		
		StaffSecretary secretary = new StaffSecretary("15", "Hilal", "Buyuk", "Lecturer Information", 8, "Engineering Faculty", "2806565");
		secretary.getSecretaryGSM();
		SecretaryManager secretaryManager = new SecretaryManager();
		secretaryManager.setLecturerViaSecretary(lecturer);
		System.out.println("Degisen Lecturer Bilgileri: "+lecturer.getLecturerName() +" "+  lecturer.getLecturerSurname() +" "+ lecturer.getCourseQuantity() +"\n" 
		+ "Degistiren Sekreter Bilgileri: " + " " + secretary.getName() + " " + secretary.getSurname() + " " + secretary.getSecretaryGSM());
		
		// Grade
		Grade grade = new Grade(graduate.getStudentId(), graduate.getName(),graduate.getSurname(), graduate.getYear(), course3.getCourseName(),
				course3.getCourseCode(),course.getCredit(), course.getCourseLocation(), course.getLecturerName(), course.getLecturerSurname());
		gradeManager.setGrade(grade);
		
		for (Grade grades : gradeManager.showGrades()) {
			System.out.println(grades.getCourseName());
			System.out.println(grades.getLecturerName() + " ");
			System.out.println(grades.getLecturerSurname()+ " ");
			System.out.println(grades.getStudentId()+ " ");
			System.out.println(grades.getName()+ " ");
			System.out.println(grades.getSurname()+ " ");
			System.out.println(grades.getGrade()+ " ");
		}
	}

}
