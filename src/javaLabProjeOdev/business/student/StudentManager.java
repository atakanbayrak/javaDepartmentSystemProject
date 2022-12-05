package javaLabProjeOdev.business.student;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.entities.student.StudentDoctoral;
import javaLabProjeOdev.entities.student.StudentGraduate;
import javaLabProjeOdev.entities.student.StudentMaster;
import javaLabProjeOdev.entities.student.StudentUnderGraduate;

public class StudentManager {

	List<StudentDoctoral> studentsDoctoral = new ArrayList<StudentDoctoral>();
	List<StudentGraduate> studentsGraduate = new ArrayList<StudentGraduate>();
	List<StudentUnderGraduate> studentsUnderGraduate = new ArrayList<StudentUnderGraduate>();
	List<StudentMaster> studentsMaster = new ArrayList<StudentMaster>();

	public void addDoctoralStudent(StudentDoctoral student) {

		System.out.println("Doktora Öğrencisi Sisteme eklendi");
		studentsDoctoral.add(student);
	}

	public void addGraduateStudent(StudentGraduate student) {
		studentsGraduate.add(student);
	}

	public void addUnderGraduateStudent(StudentUnderGraduate student) {
		studentsUnderGraduate.add(student);
	}

	public void addMasterStudent(StudentMaster student) {
		studentsMaster.add(student);
	}

	public List<StudentDoctoral> showStudentsDoctoral() {
		return studentsDoctoral;
	}

	public List<StudentGraduate> showStudentsGraduate() {
		return studentsGraduate;
	}

	public List<StudentUnderGraduate> showStudentsUnderGraduate() {
		return studentsUnderGraduate;
	}

	public List<StudentMaster> showStudentsMaster() {
		return studentsMaster;
	}
}
