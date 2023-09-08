package com.VisualIt.Policy.ServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.VisualIt.Policy.Entity.policy;
import com.VisualIt.Policy.Exceptions.ExceptionConstants;
import com.VisualIt.Policy.Exceptions.PolicyAlreadyExistsException;
import com.VisualIt.Policy.Payload.PolicyDto;
import com.VisualIt.Policy.Repositry.PolicyRepositry;
import com.VisualIt.Policy.Service.PolicyServiceInterface;

/**
 * @author durga
 *
 */

@Service
public class PolicyServiceImp implements PolicyServiceInterface {
	
	@Autowired
	private PolicyRepositry policyRepositry;
	
	@Autowired
	private ModelMapper mapper;
	
	
	@Override
	public PolicyDto SavePolicy(PolicyDto policyDto)  {
		
		if (policyRepositry.existsByPolicyNumber(policyDto.getPolicyNumber())) {
            throw new PolicyAlreadyExistsException(HttpStatus.BAD_REQUEST,ExceptionConstants.POLICY_ALL_READY_EXISTED);
        }
		
		policy policy = mapToEntity(policyDto); 
	 
		policy newpolicy = policyRepositry.save(policy);
		PolicyDto policyResponse = mapToDTO(newpolicy);
       return policyResponse;
	
	 }
	
	
	
	
	/*@Override
	public PolicyDto SavePolicy(PolicyDto policyDto)  {
		policy policy = mapToEntity(policyDto); 
	 try {
		policy newpolicy = policyRepositry.save(policy);
		PolicyDto policyResponse = mapToDTO(newpolicy);
       return policyResponse;
		}catch (Exception e) {
			
			if (policyRepositry.existsByPolicyNumber(policy.getPolicyNumber())) {
	            throw new PolicyAlreadyExistsException(HttpStatus.BAD_REQUEST,ExceptionConstants.POLICY_ALL_READY_EXISTED);
	        }
		}
	return policyDto;
		
        
	}
	*/
	
	
/*	@Override
	public PolicyDto SavePolicy(PolicyDto policydto) {
		
		if (policyRepositry.existsByPolicyNumber(policydto.getPolicyNumber())) {
            throw new PolicyAlreadyExistsException(HttpStatus.BAD_REQUEST,ExceptionConstants.POLICY_ALL_READY_EXISTED);
        }
		
		policy policys = new policy();
		policys.setId(policydto.getId());
		policys.setPolicyNumber(policydto.getPolicyNumber());
		policys.setPolicyHolderName(policydto.getPolicyHolderName());
		policys.setValidFrom(policydto.getValidFrom());
		policys.setValidTo(policydto.getValidTo());
		policys.setPaymentMode(policydto.getPaymentMode());
		policys.setPolicyPremiumAmount(policydto.getPolicyPremiumAmount());
		policys.setNumberOfTerms(policydto.getNumberOfTerms());
		policys.setSumAssured(policydto.getSumAssured());
		policys.setPolicyHolderAadhaar(policydto.getPolicyHolderAadhaar());
		policys.setDob(policydto.getDob());
		policys.setPolicyCreatedOn(policydto.getPolicyCreatedOn());
		policy  policey =policyRepositry.save(policys);
		
		 
	   
	}*/

	// convert Entity into DTO
		private PolicyDto mapToDTO(policy policy) {
			PolicyDto policyDto = mapper.map(policy, PolicyDto.class);
			return policyDto;
		}

	// convert DTO to entity
		private policy mapToEntity(PolicyDto policyDto) {
			policy policy = mapper.map(policyDto, policy.class);
			return policy;
		}

}
