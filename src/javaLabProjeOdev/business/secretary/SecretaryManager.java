package javaLabProjeOdev.business.secretary;

import javaLabProjeOdev.entities.lecturer.Lecturer;

public class SecretaryManager {
	
	public SecretaryManager(){
		
	}
	
	public Lecturer setLecturerViaSecretary(Lecturer lecturer) {
		if(lecturer.getLecturerId() != null && lecturer.getLecturerName() != "" && lecturer.getLecturerSurname() != "") {
			
			lecturer.setLecturerName("Yusuf");
			lecturer.setLecturerSurname("Budak");
			System.out.println("Degisiklikler yapildi");
			
		}
		return lecturer;
	}

}
