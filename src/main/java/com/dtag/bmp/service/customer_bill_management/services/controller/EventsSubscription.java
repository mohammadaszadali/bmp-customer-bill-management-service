package com.dtag.bmp.service.customer_bill_management.services.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtag.bmp.service.customer_bill_management.model.CustomerBillPatchRequest;
import com.dtag.bmp.service.customer_bill_management.model.EventSubscription;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
public class EventsSubscription {
	
	
	@ApiOperation(value = "Register a listener", notes = "Sets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@PostMapping(value = { "/hub" })
	public ResponseEntity<?> registerHub(
			@RequestBody EventSubscription eventSubscription)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;

		responseEntity = new ResponseEntity<>(eventSubscription, HttpStatus.OK);

		return responseEntity;
	}
	
	@ApiOperation(value = "Unregister a listener", notes = "Resets the communication endpoint address the service instance must use to deliver information about its health state, execution state, failures and metrics.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 500, message = "Internal Server Error") })
	@DeleteMapping(value = { "/hub/{id}" })
	public ResponseEntity<?> deletRegistredHubById(@PathVariable String id)
			throws com.fasterxml.jackson.core.JsonProcessingException {
		ResponseEntity<?> responseEntity = null;

		System.out.println("id" + id);

		return responseEntity;
	}
}
