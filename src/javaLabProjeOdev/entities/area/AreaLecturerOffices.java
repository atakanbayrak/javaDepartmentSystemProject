package javaLabProjeOdev.entities.area;

public class AreaLecturerOffices extends Area{

	private String lecturerOfficeDay;
	private String mostAvaliableOfficeHour;
	
	public AreaLecturerOffices(String areaName, String areaChargePersonType, String areaCapability,String lecturerOfficeDay,String mostAvaliableOfficeHour) {
		super(areaName, areaChargePersonType, areaCapability);
		// TODO Auto-generated constructor stub
		this.lecturerOfficeDay = lecturerOfficeDay;
		this.mostAvaliableOfficeHour = mostAvaliableOfficeHour;
	}

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
