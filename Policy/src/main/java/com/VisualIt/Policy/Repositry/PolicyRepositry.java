package com.VisualIt.Policy.Repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.VisualIt.Policy.Entity.policy;

/**
 * @author durga
 *
 */
public interface PolicyRepositry extends JpaRepository<policy, Long> {

	public boolean existsByPolicyNumber(String policyNumber);

	public Optional<policy> findById(Long policyId);

}
