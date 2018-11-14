package com.eloqua.mastermaq.entity;

import java.util.List;

import com.eloqua.mastermaq.client.ConversaoDeData;

public class ContaEloqua {
    private String accessedAt;
    private String address1;
    private String address2;
    private String address3;
    private String businessPhone;
    private String city;
    private String country;
    private String createdAt;
    private String createdBy;
    private String currentStatus;
    private String depth;
    private String description;
    private List<FieldValue> fieldValues;
    private String id;
    private String name;
    private String permissions;
    private String postalCode;
    private String province;
    private String type;
    private String updatedAt;
    private String updateBy;
    
    public String getAccessedAt() {
        return accessedAt;
    }
    
    public void setAccessedAt(long dataLong) {
        String dataString = ConversaoDeData.getDateString(dataLong);
        accessedAt = dataString;
    }
    
    public String getAddress1() {
        return address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    
    public String getAddress2() {
        return address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    public String getAddress3() {
        return address3;
    }
    
    public void setAddress3(String address3) {
        this.address3 = address3;
    }
    
    public String getBusinessPhone() {
        return businessPhone;
    }
    
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getCreatedAt() {
        return createdAt;
    }
    
    public void setCreatedAt(long dataLong) {
        String dataString = ConversaoDeData.getDateString(dataLong);
        createdAt = dataString;
    }
    
    public String getCreatedBy() {       
        return createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public String getCurrentStatus() {
        return currentStatus;
    }
    
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
    
    public String getDepth() {
        return depth;
    }
    
    public void setDepth(String depth) {
        this.depth = depth;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public List<FieldValue> getFieldValues() {
        return fieldValues;
    }
    
    public void setFieldValues(List<FieldValue> fieldValues) {
        this.fieldValues = fieldValues;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPermissions() {
        return permissions;
    }
    
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
    
    public String getPostalCode() {
        return postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getProvince() {
        return province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getUpdatedAt() {
        return updatedAt;
    }
    
    public void setUpdatedAt(long dataLong) {
        String dataString = ConversaoDeData.getDateString(dataLong);
        updatedAt = dataString;
    }
    
    public String getUpdateBy() {
        return updateBy;
    }
    
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }    
    
}