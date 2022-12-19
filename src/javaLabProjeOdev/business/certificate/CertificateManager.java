package javaLabProjeOdev.business.certificate;

import javaLabProjeOdev.business.lecturer.LecturerManager;
import javaLabProjeOdev.entities.lecturer.Lecturer;
import javaLabProjeOdev.entities.student.Student;

public class CertificateManager {
	
	public CertificateManager() {
		
	}
	
	public String giveCertificate(LecturerManager lecturerManager,Lecturer lecturer, Student student) {
		
		
		if(lecturer.getLecturerName() == lecturerManager.getChooseHeadOfDepartment().getLecturerName() 
				&& lecturer.getLecturerId() == lecturerManager.getChooseHeadOfDepartment().getLecturerId())
		{
			System.out.println("Your have permission to give certificate...");
			
		}
		
		
		return "Certificate is created";
	}

}
