package javaLabProjeOdev.business.student;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.entities.student.StudentDoctoral;
import javaLabProjeOdev.entities.student.StudentGraduate;
import javaLabProjeOdev.entities.student.StudentMaster;
import javaLabProjeOdev.entities.student.StudentUnderGraduate;

public class StudentManager {

	// Generic lists for allocating students from different sub student classes.
	List<StudentDoctoral> studentsDoctoral = new ArrayList<StudentDoctoral>();
	List<StudentGraduate> studentsGraduate = new ArrayList<StudentGraduate>();
	List<StudentUnderGraduate> studentsUnderGraduate = new ArrayList<StudentUnderGraduate>();
	List<StudentMaster> studentsMaster = new ArrayList<StudentMaster>();

	// Adding doctoral students
	public void addDoctoralStudent(StudentDoctoral student) {

		System.out.println("Doktora Öğrencisi Sisteme eklendi");
		studentsDoctoral.add(student);
	}

	// Adding graduate students
	public void addGraduateStudent(StudentGraduate student) {
		studentsGraduate.add(student);
	}

	// Adding undergraduate students
	public void addUnderGraduateStudent(StudentUnderGraduate student) {
		studentsUnderGraduate.add(student);
	}

	// Adding master students
	public void addMasterStudent(StudentMaster student) {
		studentsMaster.add(student);
	}

	// Showing exist doctoral list
	public List<StudentDoctoral> showStudentsDoctoral() {
		return studentsDoctoral;
	}

	// Showing exist graduate list
	public List<StudentGraduate> showStudentsGraduate() {
		return studentsGraduate;
	}

	// Showing exist undergraduate list
	public List<StudentUnderGraduate> showStudentsUnderGraduate() {
		return studentsUnderGraduate;
	}

	// Showing master list
	public List<StudentMaster> showStudentsMaster() {
		return studentsMaster;
	}
}
