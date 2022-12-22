package javaLabProjeOdev.entities.staff;

public class StaffTechnical extends Staff{

	// Staff class sub class StaffTechnical class variables
	private String technicalField;
	private String responsibleCompany;
	private String contractYear;
	private boolean isDependentFromSchool;
	
	// Staff class sub class StaffTechnical class constructor
	public StaffTechnical(String staffId, String name, String surname, String taskInformation, float workingHours,String technicalField,String responsibleCompany,String contractYear,boolean isDependentFromSchool) {
		super(staffId, name, surname, taskInformation, workingHours);
		// TODO Auto-generated constructor stub
		
		this.technicalField = technicalField;
		this.responsibleCompany = responsibleCompany;
		this.contractYear = contractYear;
		this.isDependentFromSchool = isDependentFromSchool;
	}

	// Staff class sub class StaffTechnical class gets and sets
	public String getTechnicalField() {
		return technicalField;
	}

	public void setTechnicalField(String technicalField) {
		this.technicalField = technicalField;
	}

	public String getResponsibleCompany() {
		return responsibleCompany;
	}

	public void setResponsibleCompany(String responsibleCompany) {
		this.responsibleCompany = responsibleCompany;
	}

	public String getContractYear() {
		return contractYear;
	}

	public void setContractYear(String contractYear) {
		this.contractYear = contractYear;
	}

	public boolean isDependentFromSchool() {
		return isDependentFromSchool;
	}

	public void setDependentFromSchool(boolean isDependentFromSchool) {
		this.isDependentFromSchool = isDependentFromSchool;
	}
	
	

	
}
