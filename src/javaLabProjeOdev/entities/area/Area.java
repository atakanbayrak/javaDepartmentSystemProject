package javaLabProjeOdev.entities.area;

public class Area {

	// Area main class variables
 	private String areaName;
	private String areaChargePersonType;
	private String areaCapability;
	
	// Area constructor
	public Area(String areaName, String areaChargePersonType, String areaCapability) {
		super();
		this.areaName = areaName;
		this.areaChargePersonType = areaChargePersonType;
		this.areaCapability = areaCapability;
	}

	// Area gets and sets
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaChargePerson() {
		return areaChargePersonType;
	}

	public void setAreaChargePerson(String areaChargePerson) {
		this.areaChargePersonType = areaChargePerson;
	}

	public String getAreaCapability() {
		return areaCapability;
	}

	public void setAreaCapability(String areaCapability) {
		this.areaCapability = areaCapability;
	}
	
	
}
