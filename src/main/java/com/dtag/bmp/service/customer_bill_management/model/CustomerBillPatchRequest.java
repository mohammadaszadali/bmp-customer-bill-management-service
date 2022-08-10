package com.dtag.bmp.service.customer_bill_management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerBillPatchRequest {
	
	@JsonProperty("state")
	private String state;
	@JsonProperty("@baseType")
	private String baseType;
	@JsonProperty("@schemaLocation")
	private String schemaLocation;
	@JsonProperty("@type")
	private String type;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getBaseType() {
		return baseType;
	}
	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}
	public String getSchemaLocation() {
		return schemaLocation;
	}
	public void setSchemaLocation(String schemaLocation) {
		this.schemaLocation = schemaLocation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
