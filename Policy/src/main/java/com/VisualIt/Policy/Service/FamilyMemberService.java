package com.VisualIt.Policy.Service;

import com.VisualIt.Policy.Payload.FamilyMemberDto;

/**
 * @author durga
 *
 */
public interface FamilyMemberService {

	public FamilyMemberDto createFamilyMember(Long policyId, FamilyMemberDto familyMemberDto);

	public FamilyMemberDto updatefamilyMember(Long policyId, Long famaliyId, FamilyMemberDto familyMemberDto);

	public void deletefamilyMember(Long policyId, Long famaliyId);


}
