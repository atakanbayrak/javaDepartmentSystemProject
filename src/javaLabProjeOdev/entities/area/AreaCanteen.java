package javaLabProjeOdev.entities.area;

public class AreaCanteen extends Area{

	// Area subclass which is AreaCantten variables
	private String responsiblePersonName;
	private String responsiblePersonSurname;
	private String responsiblePersonGSM;
	private String responsiblePersonSince;
	
	// Sub class constructor
	public AreaCanteen(String areaName, String areaChargePersonType, String areaCapability,String responsiblePersonName,String responsiblePersonSurname,String responsiblePersonGSM,String responsiblePersonSince) {
		
		super(areaName, areaChargePersonType, areaCapability);
		this.responsiblePersonName = responsiblePersonName;
		this.responsiblePersonSurname = responsiblePersonSurname;
		this.responsiblePersonGSM = responsiblePersonGSM;
		this.responsiblePersonSince = responsiblePersonSince;
		
	}

	// Sub class gets and sets
	public String getResponsiblePersonName() {
		return responsiblePersonName;
	}

	public void setResponsiblePersonName(String responsiblePersonName) {
		this.responsiblePersonName = responsiblePersonName;
	}

	public String getResponsiblePersonSurname() {
		return responsiblePersonSurname;
	}

	public void setResponsiblePersonSurname(String responsiblePersonSurname) {
		this.responsiblePersonSurname = responsiblePersonSurname;
	}

	public String getResponsiblePersonGSM() {
		return responsiblePersonGSM;
	}

	public void setResponsiblePersonGSM(String responsiblePersonGSM) {
		this.responsiblePersonGSM = responsiblePersonGSM;
	}

	public String getResponsiblePersonSince() {
		return responsiblePersonSince;
	}

	public void setResponsiblePersonSince(String responsiblePersonSince) {
		this.responsiblePersonSince = responsiblePersonSince;
	}
	
	
}
