package com.VisualIt.Policy.ServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VisualIt.Policy.Entity.FamilyMember;
import com.VisualIt.Policy.Entity.policy;
import com.VisualIt.Policy.Exceptions.ResourceNotFoundException;
import com.VisualIt.Policy.Payload.FamilyMemberDto;
import com.VisualIt.Policy.Repositry.FamaliyMemberRepositry;
import com.VisualIt.Policy.Repositry.PolicyRepositry;
import com.VisualIt.Policy.Service.FamilyMemberService;

/**
 * @author durga
 *
 */
@Service
public class FamilyMemberServiceimpl implements FamilyMemberService {

	@Autowired
	private FamaliyMemberRepositry famaliyMemberRepositry;

	@Autowired
	private PolicyRepositry policyRepositry;

	@Autowired
	private ModelMapper mapper;

	@Override
	public FamilyMemberDto createFamilyMember(Long policyId, FamilyMemberDto familyMemberDto) {
		FamilyMember famlyMember = mapToEntity(familyMemberDto);

		// retrive post entity by id

		policy policys = policyRepositry.findById(policyId).orElseThrow(() -> new ResourceNotFoundException("policyId", "id", policyId));;

		// set post to comment entity
		famlyMember.setPolicy(policys);
		;

		// send comment entity to database
		FamilyMember newFamilyMember = famaliyMemberRepositry.save(famlyMember);
		return mapToDto(newFamilyMember);
	}

	@Override
	public FamilyMemberDto updatefamilyMember(Long policyId, Long famaliyId, FamilyMemberDto familyMemberDto) {
		policy policys = policyRepositry.findById(policyId).orElseThrow(() -> new ResourceNotFoundException("famaliyId", "id", famaliyId));

		// retrieve comment by id
		FamilyMember FamilyMembe = famaliyMemberRepositry.findById(famaliyId)
				.orElseThrow(() -> new ResourceNotFoundException("famaliyId", "id", famaliyId));
		FamilyMembe.setPolicyNumber(familyMemberDto.getPolicyNumber());
		FamilyMembe.setMemberName(familyMemberDto.getMemberName());
		FamilyMembe.setRelationship(familyMemberDto.getRelationship());
		FamilyMembe.setDob(familyMemberDto.getDob());

		FamilyMember updatedFamilyMember = famaliyMemberRepositry.save(FamilyMembe);
		return mapToDto(updatedFamilyMember);
	}

	@Override
	public void deletefamilyMember(Long policyId, Long famaliyId) {
		policy policys = policyRepositry.findById(policyId).orElseThrow(() -> new ResourceNotFoundException("famaliyId", "id", famaliyId));;

		// retrieve comment by id
		FamilyMember FamilyMember = famaliyMemberRepositry.findById(famaliyId)
				.orElseThrow(() -> new ResourceNotFoundException("famaliyId", "id", famaliyId));

		famaliyMemberRepositry.delete(FamilyMember);

	}

	private FamilyMemberDto mapToDto(FamilyMember familyMember) {
		FamilyMemberDto familyMemberDto = mapper.map(familyMember, FamilyMemberDto.class);
		return familyMemberDto;
	}

	private FamilyMember mapToEntity(FamilyMemberDto familyMemberDto) {
		FamilyMember commentEntity = mapper.map(familyMemberDto, FamilyMember.class);
		return commentEntity;
	}

}
