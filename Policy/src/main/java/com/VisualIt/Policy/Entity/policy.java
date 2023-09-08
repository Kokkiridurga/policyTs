package com.VisualIt.Policy.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="policy")

/**
 * @author durga
 *
 */
public class policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false,unique =true)
    private String policyNumber;
	@Column(nullable = false)
    private String policyHolderName;
	@Column(nullable = false)
    private Date validFrom;
	@Column(nullable = false)
    private Date validTo;
	@Column(nullable = false)
    private String paymentMode;
	@Column(nullable = false)
    private double policyPremiumAmount;
	@Column(nullable = false)
    private int numberOfTerms;
	@Column(nullable = false)
    private double sumAssured;
	@Column(nullable = false)
    private String policyHolderAadhaar;
	@Column(nullable = false)
    private Date dob;
	@Column(nullable = false)
    private Date policyCreatedOn;
    @OneToMany(mappedBy = "policy", cascade = CascadeType.ALL,orphanRemoval = true)
	private List<FamilyMember> FamilyMember;
	
	
    public policy() {
		super();
	}


	public policy(Long id, String policyNumber, String policyHolderName, Date validFrom, Date validTo,
			String paymentMode, double policyPremiumAmount, int numberOfTerms, double sumAssured,
			String policyHolderAadhaar, Date dob, Date policyCreatedOn,
			List<com.VisualIt.Policy.Entity.FamilyMember> familyMember) {
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


	public policy(String policyNumber, String policyHolderName, Date validFrom, Date validTo, String paymentMode,
			double policyPremiumAmount, int numberOfTerms, double sumAssured, String policyHolderAadhaar, Date dob,
			Date policyCreatedOn, List<com.VisualIt.Policy.Entity.FamilyMember> familyMember) {
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
