package javaLabProjeOdev.entities.student;

public class StudentDoctoral extends Student{

	private String doctoraField;
	private boolean isDoctoraApproved;
	private int thesisQuantity;
	public StudentDoctoral(String studentId, String name, String surname, String year,String doctoraField,boolean isDoctoraApproved,int thesisQuantity) {
		super(studentId, name, surname, year);
		// TODO Auto-generated constructor stub
		this.doctoraField = doctoraField;
		this.isDoctoraApproved = isDoctoraApproved;
		this.thesisQuantity = thesisQuantity;
	}
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
