package javaLabProjeOdev.entities.staff;


public class StaffSecretary extends Staff{

	private String secretaryPlace;
	private String secretaryGSM;
	
	public StaffSecretary(String staffId, String name, String surname, String taskInformation, float workingHours,String secretaryPlace,String secretaryGSM) {
		super(staffId, name, surname, taskInformation, workingHours);
		// TODO Auto-generated constructor stub
		this.secretaryPlace = secretaryPlace;
		this.secretaryGSM = secretaryGSM;
	}


	public String getSecretaryPlace() {
		return secretaryPlace;
	}


	public void setSecretaryPlace(String secretaryPlace) {
		this.secretaryPlace = secretaryPlace;
	}


	public String getSecretaryGSM() {
		return secretaryGSM;
	}


	public void setSecretaryGSM(String secretaryGSM) {
		this.secretaryGSM = secretaryGSM;
	}
	
	

	
	

}
