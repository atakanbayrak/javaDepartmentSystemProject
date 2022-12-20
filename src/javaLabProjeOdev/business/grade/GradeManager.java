package javaLabProjeOdev.business.grade;

import java.util.ArrayList;
import java.util.List;

import javaLabProjeOdev.entities.grade.Grade;

public class GradeManager {
	
	List<Grade> grades = new ArrayList<Grade>();

	public GradeManager() {
		
	}
	
	public boolean setGrade(Grade grade) {
		
		if(grade.getCourseName() != "" && grade.getName() != "" && grade.getSurname() != "" && grade.getCourseCode() != "" && grade.getLecturerName() != "" && grade.getLecturerSurname() != "" && grade.getGrade() != "") {
			grade.setGrade("75");
			grades.add(grade);
			return true;
		}
		return false;
	}
	
	public List<Grade> showGrades(){
		return grades;
	}
}
