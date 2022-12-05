package javaLabProjeOdev.entities.area;

public class AreaGarden extends Area{

	private String areaSquareMeter;
	private boolean isSitablePlace;
	private boolean isUsableForGuestAcceptance;
	
	public AreaGarden(String areaName, String areaChargePersonType, String areaCapability,String areaSquareMeter, boolean isSitablePlace, boolean isUsableForGuestAcceptance) {
		super(areaName, areaChargePersonType, areaCapability);
		// TODO Auto-generated constructor stubt
		this.areaSquareMeter = areaSquareMeter;
		this.isSitablePlace = isSitablePlace;
		this.isUsableForGuestAcceptance = isUsableForGuestAcceptance;
	}

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
