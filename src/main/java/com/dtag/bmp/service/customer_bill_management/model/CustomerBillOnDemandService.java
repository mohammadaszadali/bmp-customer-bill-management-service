
package com.dtag.bmp.service.customer_bill_management.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "lastUpdate",
    "name",
    "billingAccount",
    "customerBill",
    "relatedParty",
    "state",
    "@baseType",
    "@schemaLocation",
    "@type"
})
public class CustomerBillOnDemandService {

    @JsonProperty("description")
    private String description;
    @JsonProperty("lastUpdate")
    private String lastUpdate;
    @JsonProperty("name")
    private String name;
    @JsonProperty("billingAccount")
    private BillingAccount billingAccount;
    @JsonProperty("customerBill")
    private CustomerBill customerBill;
    @JsonProperty("relatedParty")
    private RelatedParty relatedParty;
    @JsonProperty("state")
    private String state;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@type")
    private String type;

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("lastUpdate")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("lastUpdate")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("billingAccount")
    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    @JsonProperty("billingAccount")
    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
    }

    @JsonProperty("customerBill")
    public CustomerBill getCustomerBill() {
        return customerBill;
    }

    @JsonProperty("customerBill")
    public void setCustomerBill(CustomerBill customerBill) {
        this.customerBill = customerBill;
    }

    @JsonProperty("relatedParty")
    public RelatedParty getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(RelatedParty relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    @JsonProperty("@baseType")
    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    @JsonProperty("@schemaLocation")
    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

}
