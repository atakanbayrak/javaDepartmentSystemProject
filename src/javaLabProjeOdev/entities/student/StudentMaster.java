package javaLabProjeOdev.entities.student;

public class StudentMaster extends Student{
	
	private String masterThesisName;
	private boolean isAvaliableForEducateInSchool;
	
	public StudentMaster(String studentId, String name, String surname, String year,String masterThesisName,boolean isAvaliableForEducateInSchool) {
		super(studentId, name, surname, year);
		// TODO Auto-generated constructor stub
		this.masterThesisName = masterThesisName;
		this.isAvaliableForEducateInSchool = isAvaliableForEducateInSchool;
	}

	public String getMasterThesisName() {
		return masterThesisName;
	}

	public void setMasterThesisName(String masterThesisName) {
		this.masterThesisName = masterThesisName;
	}

	public boolean isAvaliableForEducateInSchool() {
		return isAvaliableForEducateInSchool;
	}

	public void setAvaliableForEducateInSchool(boolean isAvaliableForEducateInSchool) {
		this.isAvaliableForEducateInSchool = isAvaliableForEducateInSchool;
	}
	
	

}
