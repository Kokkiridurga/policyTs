package com.VisualIt.Policy.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VisualIt.Policy.Payload.PolicyDto;
import com.VisualIt.Policy.Service.PolicyServiceInterface;

import jakarta.validation.Valid;



/**
 * @author durga
 *
 */
@RestController
@RequestMapping("api/v1")
public class PolicyController {

	@Autowired
	private PolicyServiceInterface policyServiceInterface;

	@PostMapping("/policy")
	public ResponseEntity<?> SavePolicy(@Valid @RequestBody PolicyDto policy, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			Map<String, String> validationsMap = new HashMap<String, String>();
			for (FieldError error : bindingResult.getFieldErrors()) {
				validationsMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(validationsMap, HttpStatus.BAD_REQUEST);

		} else {
			PolicyDto createPolicy = policyServiceInterface.SavePolicy(policy);
			return new ResponseEntity<>(createPolicy, HttpStatus.CREATED);
		}

	}

	
}
