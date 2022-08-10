package com.dtag.bmp.service.customer_bill_management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventSubscription {
	
    @JsonProperty("id")
	private String id;
    @JsonProperty("callback")
	private String callback;
    @JsonProperty("query")
	private String query;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCallback() {
		return callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
