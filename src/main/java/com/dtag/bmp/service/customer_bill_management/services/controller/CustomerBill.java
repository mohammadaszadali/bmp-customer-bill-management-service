package com.dtag.bmp.service.customer_bill_management.services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtag.bmp.service.customer_bill_management.model.CustomerBillPatchRequest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class CustomerBill {

	@ApiOperation(value = "List or find CustomerBill objects", notes = "This operation list or find CustomerBill entities")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping(value = { "/customerBill" })
	public ResponseEntity<?> getCustomerBill(@RequestParam String fields, @RequestParam Integer offset,
			@RequestParam Integer limit) throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;

		System.out.println("fields" + fields);
		System.out.println("offset" + offset);
		System.out.println("limit" + limit);

		return responseEntity;
	}

	@ApiOperation(value = "Retrieves a CustomerBill by ID", notes = "This operation retrieves a CustomerBill entity. Attribute selection is enabled for all first level attributes.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@GetMapping(value = { "/customerBill/{id}" })
	public ResponseEntity<?> getCustomerBillById(@PathVariable String id, @RequestParam(required = false) String fields)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;

		System.out.println("id" + id);
		System.out.println("fields" + fields);

		return responseEntity;
	}

	@ApiOperation(value = "Updates partially a CustomerBill", notes = "This operation updates partially a CustomerBill entity.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PatchMapping(value = { "/customerBill/{id}" })
	public ResponseEntity<?> updateCustomerBillById(@PathVariable String id,
			@RequestBody CustomerBillPatchRequest customerBillPatchRequest)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;

		System.out.println("id" + id);
		System.out.println("CustomerBillPatchRequest" + customerBillPatchRequest);

		return responseEntity;
	}

}
