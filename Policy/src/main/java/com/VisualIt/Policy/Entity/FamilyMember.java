package com.VisualIt.Policy.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author durga
 *
 */
@Entity
@Table(name = "FamilyMember")
public class FamilyMember {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	private String policyNumber;
	@Column(nullable = false)
	private String memberName;
	@Column(nullable = false)
	private String relationship;
	@Column(nullable = false)
	private Date dob;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "policyId",  nullable = false)
	private policy policy;

	public FamilyMember() {
		super();
	}

	public FamilyMember(Long id, String policyNumber, String memberName, String relationship, Date dob, policy policy) {
		super();
		this.id = id;
		this.policyNumber = policyNumber;
		this.memberName = memberName;
		this.relationship = relationship;
		this.dob = dob;
		this.policy = policy;
	}

	 public FamilyMember(String policyNumber, String memberName, String relationship, Date dob, policy policy) {
		super();
		this.policyNumber = policyNumber;
		this.memberName = memberName;
		this.relationship = relationship;
		this.dob = dob;
		this.policy = policy;
	}
	
	/*public FamilyMember(Long id, String memberName, String relationship, Date dob,
			com.VisualIt.Policy.Entity.policy policy) {
		super();
		this.id = id;
		this.memberName = memberName;
		this.relationship = relationship;
		this.dob = dob;
		this.policy = policy;
	}
	
	
	

	public FamilyMember(String memberName, String relationship, Date dob, com.VisualIt.Policy.Entity.policy policy) {
		super();
		this.memberName = memberName;
		this.relationship = relationship;
		this.dob = dob;
		this.policy = policy;
	}*/

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

	public policy getPolicy() {
		return policy;
	}

	public void setPolicy(policy policy) {
		this.policy = policy;
	}

	

	@Override
	public String toString() {
		return "FamilyMember [id=" + id + ", policyNumber=" + policyNumber + ", memberName=" + memberName
				+ ", relationship=" + relationship + ", dob=" + dob + ", policy=" + policy + "]";
	}

	
	
	
	
}
