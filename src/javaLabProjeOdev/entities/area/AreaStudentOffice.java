package javaLabProjeOdev.entities.area;

public class AreaStudentOffice extends Area{
	
	final private boolean isStudentOfficeWorkHowItReallyShouldBe = false;
	private String studentOfficeGsmNumber;
	
	public AreaStudentOffice(String areaName, String areaChargePersonType, String areaCapability,String studentOfficeGsmNumber) {
		super(areaName, areaChargePersonType, areaCapability);
		this.studentOfficeGsmNumber = studentOfficeGsmNumber;
	}
	
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
