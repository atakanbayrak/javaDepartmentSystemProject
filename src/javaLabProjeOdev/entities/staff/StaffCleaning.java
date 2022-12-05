package javaLabProjeOdev.entities.staff;

public class StaffCleaning extends Staff{

	private String responsiblePlace;
	private String responsibleCompany;
	private String passedYearInDepartment;
	
	
	public StaffCleaning(String staffId, String name, String surname,String taskInformation, float workingHours,String responsiblePlace,String responsibleCompany,String passedYearInDepartment) {
		super(staffId, name, surname, taskInformation, workingHours);
		this.responsiblePlace = responsiblePlace;
		this.responsibleCompany = responsibleCompany;
		this.passedYearInDepartment = passedYearInDepartment;
	}


	public String getResponsiblePlace() {
		return responsiblePlace;
	}


	public void setResponsiblePlace(String responsiblePlace) {
		this.responsiblePlace = responsiblePlace;
	}


	public String getResponsibleCompany() {
		return responsibleCompany;
	}


	public void setResponsibleCompany(String responsibleCompany) {
		this.responsibleCompany = responsibleCompany;
	}


	public String getPassedYearInDepartment() {
		return passedYearInDepartment;
	}


	public void setPassedYearInDepartment(String passedYearInDepartment) {
		this.passedYearInDepartment = passedYearInDepartment;
	}
	
	
	

}
