package javaLabProjeOdev.entities.area;

public class AreaAssistantStaffOffices extends Area{

	private String assistantName;
	private String assistantSurname;
	private String assistantMail;
	
	public AreaAssistantStaffOffices(String areaName, String areaChargePersonType, String areaCapability, String assistantName,String assistantSurname,String assistantMail) {
		super(areaName, areaChargePersonType, areaCapability);
		// TODO Auto-generated constructor stub
		this.assistantName = assistantName;
		this.assistantSurname = assistantSurname;
		this.assistantMail = assistantMail;
	}

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
