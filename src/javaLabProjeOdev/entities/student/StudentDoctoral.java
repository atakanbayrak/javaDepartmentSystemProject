package javaLabProjeOdev.entities.student;

public class StudentDoctoral extends Student{

	// StudentDoctoral class which is sub class of Student variables
	private String doctoraField;
	private boolean isDoctoraApproved;
	private int thesisQuantity;
	
	// StudentDoctoral class which is sub class of Student constructor
	public StudentDoctoral(String studentId, String name, String surname, String year,String doctoraField,boolean isDoctoraApproved,int thesisQuantity) {
		super(studentId, name, surname, year);
		this.doctoraField = doctoraField;
		this.isDoctoraApproved = isDoctoraApproved;
		this.thesisQuantity = thesisQuantity;
	}
	
	// StudentDoctoral class which is sub class of Student gets and sets
	public String getDoctoraField() {
		return doctoraField;
	}
	public void setDoctoraField(String doctoraField) {
		this.doctoraField = doctoraField;
	}
	public boolean isDoctoraApproved() {
		return isDoctoraApproved;
	}
	public void setDoctoraApproved(boolean isDoctoraApproved) {
		this.isDoctoraApproved = isDoctoraApproved;
	}
	public int getThesisQuantity() {
		return thesisQuantity;
	}
	public void setThesisQuantity(int thesisQuantity) {
		this.thesisQuantity = thesisQuantity;
	}
	
	

}
