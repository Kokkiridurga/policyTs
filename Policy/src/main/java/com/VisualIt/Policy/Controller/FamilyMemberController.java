package com.VisualIt.Policy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VisualIt.Policy.Payload.FamilyMemberDto;
import com.VisualIt.Policy.Service.FamilyMemberService;

import jakarta.validation.Valid;

/**
 * @author durga
 *
 */
@RestController
@RequestMapping("/api/v1")
public class FamilyMemberController {

	@Autowired
	private FamilyMemberService familyMemberService;

	@PostMapping("/policy/{policyId}/famailynum")

	public ResponseEntity<FamilyMemberDto> createfamilyMember(@PathVariable(value = "policyId") Long policyId,
			@Valid @RequestBody FamilyMemberDto familyMemberDto) {
		return new ResponseEntity<>(familyMemberService.createFamilyMember(policyId, familyMemberDto),
				HttpStatus.CREATED);
	}

	
	
	@PutMapping("/policy/{policyId}/famailynum/{id}")
	public ResponseEntity<FamilyMemberDto> updateComment(@PathVariable(value = "policyId") Long policyId,
			@PathVariable(value = "id") Long famaliyId, @Valid @RequestBody FamilyMemberDto familyMemberDto) {
		FamilyMemberDto updatedComment = familyMemberService.updatefamilyMember(policyId, famaliyId, familyMemberDto);
		return new ResponseEntity<>(updatedComment, HttpStatus.OK);
	}

	
	
	@DeleteMapping("/policy/{policyId}/famailynum/{id}")
	public ResponseEntity<String> deleteComment(@PathVariable(value = "FamilyMember") Long policyId,
			@PathVariable(value = "id") Long famaliyId) {
		familyMemberService.deletefamilyMember(policyId, famaliyId);
		return new ResponseEntity<>("Comment ni delete chesesaav", HttpStatus.OK);
	}

}
