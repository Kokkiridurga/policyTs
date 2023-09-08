package com.VisualIt.Policy.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VisualIt.Policy.Entity.FamilyMember;


/**
 * @author durga
 *
 */
public interface FamaliyMemberRepositry extends JpaRepository<FamilyMember, Long>{
	List<FamilyMember> findById(long policyId);

	
}
