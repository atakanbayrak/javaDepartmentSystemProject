package javaLabProjeOdev.entities.staff;

public class Staff {
	
    private String staffId;
    private String name;
    private String surname;
    private String taskInformation;
    private float workingHours;
	
    
    public Staff(String staffId, String name, String surname,String taskInformation, float workingHours) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.surname = surname;
		this.taskInformation = taskInformation;
		this.workingHours = workingHours;
	}


	public String getStaffId() {
		return staffId;
	}


	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}


	public String getTaskInformation() {
		return taskInformation;
	}


	public void setTaskInformation(String taskInformation) {
		this.taskInformation = taskInformation;
	}


	public float getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(float workingHours) {
		this.workingHours = workingHours;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}
    
    
}