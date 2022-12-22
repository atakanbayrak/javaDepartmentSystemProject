package javaLabProjeOdev.entities.area;

public class AreaLecturerOffices extends Area{

	// Area subclass which is AreaLecturerOffices variables
	private String lecturerOfficeDay;
	private String mostAvaliableOfficeHour;
	
	// Sub class constructor
	public AreaLecturerOffices(String areaName, String areaChargePersonType, String areaCapability,String lecturerOfficeDay,String mostAvaliableOfficeHour) {
		super(areaName, areaChargePersonType, areaCapability);
		this.lecturerOfficeDay = lecturerOfficeDay;
		this.mostAvaliableOfficeHour = mostAvaliableOfficeHour;
	}

	// Sub class gets and sets
	public String getLecturerOfficeDay() {
		return lecturerOfficeDay;
	}

	public void setLecturerOfficeDay(String lecturerOfficeDay) {
		this.lecturerOfficeDay = lecturerOfficeDay;
	}

	public String getMostAvaliableOfficeHour() {
		return mostAvaliableOfficeHour;
	}

	public void setMostAvaliableOfficeHour(String mostAvaliableOfficeHour) {
		this.mostAvaliableOfficeHour = mostAvaliableOfficeHour;
	}
	
	

}
