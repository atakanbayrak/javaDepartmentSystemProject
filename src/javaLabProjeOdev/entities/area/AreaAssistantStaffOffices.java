package javaLabProjeOdev.entities.area;

public class AreaAssistantStaffOffices extends Area{

	// Are sub class which is for assistant staff offices variables
	private String assistantName;
	private String assistantSurname;
	private String assistantMail;
	
	// Sub class constructor
	public AreaAssistantStaffOffices(String areaName, String areaChargePersonType, String areaCapability, String assistantName,String assistantSurname,String assistantMail) {
		super(areaName, areaChargePersonType, areaCapability);
		this.assistantName = assistantName;
		this.assistantSurname = assistantSurname;
		this.assistantMail = assistantMail;
	}

	// Sub class gets and sets
	public String getAssistantName() {
		return assistantName;
	}

	public void setAssistantName(String assistantName) {
		this.assistantName = assistantName;
	}

	public String getAssistantSurname() {
		return assistantSurname;
	}

	public void setAssistantSurname(String assistantSurname) {
		this.assistantSurname = assistantSurname;
	}

	public String getAssistantMail() {
		return assistantMail;
	}

	public void setAssistantMail(String assistantMail) {
		this.assistantMail = assistantMail;
	}

	
	
}
