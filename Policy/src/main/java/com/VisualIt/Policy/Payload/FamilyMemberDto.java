package com.VisualIt.Policy.Payload;

import java.util.Date;

import com.VisualIt.Policy.Entity.policy;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/**
 * @author durga
 *
 */
public class FamilyMemberDto {

	private Long id;
	@NotNull(message = "policyNumber is mandratry")
	private String policyNumber;

	@NotNull(message = "policyNumber is mandratry")
	private String memberName;

	@NotNull(message = "policyNumber is mandratry")
	private String relationship;

	
	private Date dob;

	public FamilyMemberDto() {
		super();
	}

	public FamilyMemberDto(String policyNumber, String memberName, String relationship, Date dob) {
		super();
		this.policyNumber = policyNumber;
		this.memberName = memberName;
		this.relationship = relationship;
		this.dob = dob;
	}

	public FamilyMemberDto(Long id, String policyNumber, String memberName, String relationship, Date dob) {
		super();
		this.id = id;
		this.policyNumber = policyNumber;
		this.memberName = memberName;
		this.relationship = relationship;
		this.dob = dob;
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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "FamilyMemberDto [id=" + id + ", policyNumber=" + policyNumber + ", memberName=" + memberName
				+ ", relationship=" + relationship + ", dob=" + dob + "]";
	}

}
