package javaLabProjeOdev.business.student;

import javaLabProjeOdev.entities.student.StudentDoctoral;
import javaLabProjeOdev.entities.student.StudentGraduate;
import javaLabProjeOdev.entities.student.StudentMaster;
import javaLabProjeOdev.entities.student.StudentUnderGraduate;

public class StudentManager {

	public void addDoctoralStudent(StudentDoctoral student) {
		System.out.println(student.getName());
	}
	
	public void addGraduateStudent(StudentGraduate student) {
		System.out.println(student.getName());
	}
	
	public void addUnderGraduateStudent(StudentUnderGraduate student) {
		System.out.println(student.getName());
	}
	
	public void addMasterStudent(StudentMaster student) {
		System.out.println(student.getName());
	}
}
