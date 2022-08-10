package com.dtag.bmp.service.customer_bill_management.services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class AppliedCustomerBillingRate {
	
	@ApiOperation(value = "List or find AppliedCustomerBillingRate objects", notes = "This operation list or find AppliedCustomerBillingRate entities.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping(value = { "/appliedCustomerBillingRate" })
	public ResponseEntity<?> getAppliedCustomerBillingRate(@RequestParam String fields, @RequestParam Integer offset,
			@RequestParam Integer limit) throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;

		System.out.println("fields" + fields);
		System.out.println("offset" + offset);
		System.out.println("limit" + limit);

		return responseEntity;
	}

	@ApiOperation(value = "Retrieves a AppliedCustomerBillingRate by ID", notes = "This operation retrieves a AppliedCustomerBillingRate entity. Attribute selection is enabled for all first level attributes.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping(value = { "/appliedCustomerBillingRate/{id}" })
	public ResponseEntity<?> getAppliedCustomerBillingRateById(@PathVariable String id, @RequestParam(required = false) String fields)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;

		System.out.println("id" + id);
		System.out.println("fields" + fields);

		return responseEntity;
	}

}
