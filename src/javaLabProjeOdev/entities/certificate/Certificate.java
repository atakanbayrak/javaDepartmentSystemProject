package javaLabProjeOdev.entities.certificate;

public class Certificate {
	
	private int certificateId;
	private String certificateType;
	private String certificateDate;
	private String certificateSignatureStampCode;
	
	
	public Certificate(int certificateId, String certificateType, String certificateDate,
			String certificateSignatureStampCode) {
		super();
		this.certificateId = certificateId;
		this.certificateType = certificateType;
		this.certificateDate = certificateDate;
		this.certificateSignatureStampCode = certificateSignatureStampCode;
	}
	
	public Certificate() {
		
	}
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	public String getCertificateDate() {
		return certificateDate;
	}
	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}
	public String getCertificateSignatureStampCode() {
		return certificateSignatureStampCode;
	}
	public void setCertificateSignatureStampCode(String certificateSignatureStampCode) {
		this.certificateSignatureStampCode = certificateSignatureStampCode;
	}
	
	

}
