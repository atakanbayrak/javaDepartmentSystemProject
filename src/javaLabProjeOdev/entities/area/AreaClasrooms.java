package javaLabProjeOdev.entities.area;

public class AreaClasrooms extends Area{

	private String facilityRate;
	private String floor;
	private boolean isUsableSymposium;
	private boolean isAvaliable;
	
	public AreaClasrooms(String areaName, String areaChargePersonType, String areaCapability,String facilityRate,String floor,boolean isUsableSymposium,boolean isAvaliable) {
		super(areaName, areaChargePersonType, areaCapability);
		// TODO Auto-generated constructor stub
		this.facilityRate = facilityRate;
		this.floor = floor;
		this.isUsableSymposium = isUsableSymposium;
		this.isAvaliable = isAvaliable;
	}

	public String getFacilityRate() {
		return facilityRate;
	}

	public void setFacilityRate(String facilityRate) {
		this.facilityRate = facilityRate;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public boolean isUsableSymposium() {
		return isUsableSymposium;
	}

	public void setUsableSymposium(boolean isUsableSymposium) {
		this.isUsableSymposium = isUsableSymposium;
	}

	public boolean getIsAvaliable() {
		return isAvaliable;
	}

	public void setLastUsedDate(boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}

	
}
