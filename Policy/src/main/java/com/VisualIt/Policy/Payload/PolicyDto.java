package com.VisualIt.Policy.Payload;

import java.util.Date;
import java.util.List;

import com.VisualIt.Policy.Entity.FamilyMember;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * @author durga
 *
 */
public class PolicyDto {

	private Long id;
	@NotNull(message = "policyNumber is mandratry")
	private String policyNumber;
	
	@NotNull(message = "policyHolderName is mandratry")
	private String policyHolderName;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date validFrom;
	
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date validTo;
	
	@NotNull(message = "paymentMode is mandratry")
	private String paymentMode;
	
	@NotNull(message = "policyPremiumAmount is mandratry")
	private double policyPremiumAmount;
	
	@NotNull(message = "numberOfTerms is mandratry")
	private int numberOfTerms;
	
	@NotNull(message = "sumAssured is mandratry")
	private double sumAssured;
	
	@NotNull(message = "policyHolderAadhaar is mandratry")
	private String policyHolderAadhaar;
	
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date dob;
	
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date policyCreatedOn;
	
	private List<FamilyMember> FamilyMember;

	public PolicyDto() {
		super();
	}

	public PolicyDto(Long id, String policyNumber, String policyHolderName, Date validFrom, Date validTo,
			String paymentMode, double policyPremiumAmount, int numberOfTerms, double sumAssured,
			String policyHolderAadhaar, Date dob, Date policyCreatedOn,
			List<FamilyMember> familyMember) {
		super();
		this.id = id;
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.paymentMode = paymentMode;
		this.policyPremiumAmount = policyPremiumAmount;
		this.numberOfTerms = numberOfTerms;
		this.sumAssured = sumAssured;
		this.policyHolderAadhaar = policyHolderAadhaar;
		this.dob = dob;
		this.policyCreatedOn = policyCreatedOn;
		FamilyMember = familyMember;
	}


	public PolicyDto(String policyNumber, String policyHolderName, Date validFrom, Date validTo, String paymentMode,
			double policyPremiumAmount, int numberOfTerms, double sumAssured, String policyHolderAadhaar, Date dob,
			Date policyCreatedOn, List<FamilyMember> familyMember) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.paymentMode = paymentMode;
		this.policyPremiumAmount = policyPremiumAmount;
		this.numberOfTerms = numberOfTerms;
		this.sumAssured = sumAssured;
		this.policyHolderAadhaar = policyHolderAadhaar;
		this.dob = dob;
		this.policyCreatedOn = policyCreatedOn;
		FamilyMember = familyMember;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}


	public String getPolicyHolderName() {
		return policyHolderName;
	}


	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}


	public Date getValidFrom() {
		return validFrom;
	}


	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}


	public Date getValidTo() {
		return validTo;
	}


	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public double getPolicyPremiumAmount() {
		return policyPremiumAmount;
	}


	public void setPolicyPremiumAmount(double policyPremiumAmount) {
		this.policyPremiumAmount = policyPremiumAmount;
	}


	public int getNumberOfTerms() {
		return numberOfTerms;
	}


	public void setNumberOfTerms(int numberOfTerms) {
		this.numberOfTerms = numberOfTerms;
	}


	public double getSumAssured() {
		return sumAssured;
	}


	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}


	public String getPolicyHolderAadhaar() {
		return policyHolderAadhaar;
	}


	public void setPolicyHolderAadhaar(String policyHolderAadhaar) {
		this.policyHolderAadhaar = policyHolderAadhaar;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Date getPolicyCreatedOn() {
		return policyCreatedOn;
	}


	public void setPolicyCreatedOn(Date policyCreatedOn) {
		this.policyCreatedOn = policyCreatedOn;
	}


	public List<FamilyMember> getFamilyMember() {
		return FamilyMember;
	}


	public void setFamilyMember(List<FamilyMember> familyMember) {
		FamilyMember = familyMember;
	}


	@Override
	public String toString() {
		return "policy [id=" + id + ", policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName
				+ ", validFrom=" + validFrom + ", validTo=" + validTo + ", paymentMode=" + paymentMode
				+ ", policyPremiumAmount=" + policyPremiumAmount + ", numberOfTerms=" + numberOfTerms + ", sumAssured="
				+ sumAssured + ", policyHolderAadhaar=" + policyHolderAadhaar + ", dob=" + dob + ", policyCreatedOn="
				+ policyCreatedOn + ", FamilyMember=" + FamilyMember + "]";
	}


}
