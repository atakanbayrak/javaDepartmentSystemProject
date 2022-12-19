package javaLabProjeOdev.business.lecturer;

import javaLabProjeOdev.entities.lecturer.Lecturer;

public class LecturerManager {

	static Lecturer headOfDepartment = new Lecturer();

	public LecturerManager() {

	}

	public boolean chooseHeadOfDepartment(Lecturer lecturer) {

		if (lecturer.getLecturerId() != "" && lecturer.getLecturerName() != "" && lecturer.getLecturerSurname() != "") {
			headOfDepartment.setLecturerId(lecturer.getLecturerId());
			headOfDepartment.setLecturerName(lecturer.getLecturerName());
			headOfDepartment.setLecturerSurname(lecturer.getLecturerSurname());
			headOfDepartment.setLecturerCourses(lecturer.getLecturerCourses());
			headOfDepartment.setCourseQuantity(lecturer.getCourseQuantity());
			return true;
		}
		return false;
	}

	public Lecturer getChooseHeadOfDepartment() {

		return headOfDepartment;
	}
	
	
}
