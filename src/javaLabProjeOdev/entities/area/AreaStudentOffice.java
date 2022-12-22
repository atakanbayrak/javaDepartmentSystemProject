package javaLabProjeOdev.entities.area;

public class AreaStudentOffice extends Area{
	
	// Area subclass which is AreaStudentOffice variables
	// Final variable for well-known reality
	final private boolean isStudentOfficeWorkHowItReallyShouldBe = false;
	private String studentOfficeGsmNumber;
	
	// Sub class constructor
	public AreaStudentOffice(String areaName, String areaChargePersonType, String areaCapability,String studentOfficeGsmNumber) {
		super(areaName, areaChargePersonType, areaCapability);
		this.studentOfficeGsmNumber = studentOfficeGsmNumber;
	}
	
	// Sub class gets and sets
	public String getStudentOfficeGsmNumber() {
		return studentOfficeGsmNumber;
	}
	public void setStudentOfficeGsmNumber(String studentOfficeGsmNumber) {
		this.studentOfficeGsmNumber = studentOfficeGsmNumber;
	}
	public boolean isStudentOfficeWorkHowItReallyShouldBe() {
		return isStudentOfficeWorkHowItReallyShouldBe;
	}

}
