package javaLabProjeOdev.entities.area;

public class AreaGarden extends Area{

	// Area subclass which is AreaGarden variables
	private String areaSquareMeter;
	private boolean isSitablePlace;
	private boolean isUsableForGuestAcceptance;
	
	// Sub class constructor
	public AreaGarden(String areaName, String areaChargePersonType, String areaCapability,String areaSquareMeter, boolean isSitablePlace, boolean isUsableForGuestAcceptance) {
		super(areaName, areaChargePersonType, areaCapability);
		this.areaSquareMeter = areaSquareMeter;
		this.isSitablePlace = isSitablePlace;
		this.isUsableForGuestAcceptance = isUsableForGuestAcceptance;
	}

	// Sub class gets and sets
	public String getAreaSquareMeter() {
		return areaSquareMeter;
	}

	public void setAreaSquareMeter(String areaSquareMeter) {
		this.areaSquareMeter = areaSquareMeter;
	}

	public boolean isSitablePlace() {
		return isSitablePlace;
	}

	public void setSitablePlace(boolean isSitablePlace) {
		this.isSitablePlace = isSitablePlace;
	}

	public boolean isUsableForGuestAcceptance() {
		return isUsableForGuestAcceptance;
	}

	public void setUsableForGuestAcceptance(boolean isUsableForGuestAcceptance) {
		this.isUsableForGuestAcceptance = isUsableForGuestAcceptance;
	}

	
}
