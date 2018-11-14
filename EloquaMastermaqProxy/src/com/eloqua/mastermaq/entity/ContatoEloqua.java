package com.eloqua.mastermaq.entity;

import java.util.List;

import com.eloqua.mastermaq.client.ConversaoDeData;

public class ContatoEloqua {
    private String accessedAt;
    private String accountId;
    private String accountName;
    private String address1;
    private String address2;
    private String address3;
    private String bouncebackDate;
    private String businessPhone;
    private String city;
    private String country;
    private String createdAt;
    private String createdBy;
    private String currentStatus;
    private String depth;
    private String description;
    private String emailAddress;
    private String emailFormatPreference;
    private String fax;
    private List<FieldValue> fieldValues;
    private String firstName;
    private String id;
    private String isBounceback;
    private String isSubscribed;
    private String isTracked;
    private String lastName;
    private String mobilePhone;
    private String name;
    private String permissions;
    private String postalCode;
    private String province;
    private String salesPerson;
    private String subscriptionDate;
    private String title;
    private String type;
    private String unsubscriptionDate;
    private String updateAt;
    private String updateBy;
    
    public String getAccessedAt() {
        return accessedAt;
    }
    
    public void setAccessedAt(long dataLong) {
        String dataString = ConversaoDeData.getDateString(dataLong);
        accessedAt = dataString;
    }
    
    public String getAccountId() {
        return accountId;
    }
    
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
    
    public String getBouncebackDate() {
        return bouncebackDate;
    }
    
    public void setBouncebackDate(long dataLong) {
        String dataString = ConversaoDeData.getDateString(dataLong);
        bouncebackDate = dataString;
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
    
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    public String getEmailFormatPreference() {
        return emailFormatPreference;
    }
    
    public void setEmailFormatPreference(String emailFormatPreference) {
        this.emailFormatPreference = emailFormatPreference;
    }
    
    public String getFax() {
        return fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public List<FieldValue> getFieldValues() {
        return fieldValues;
    }
    
    public void setFieldValues(List<FieldValue> fieldValues) {
        this.fieldValues = fieldValues;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getIsBounceback() {
        return isBounceback;
    }
    
    public void setIsBounceback(String isBounceback) {
        this.isBounceback = isBounceback;
    }
    
    public String getIsSubscribed() {
        return isSubscribed;
    }
    
    public void setIsSubscribed(String isSubscribed) {
        this.isSubscribed = isSubscribed;
    }
    
    public String getIsTracked() {
        return isTracked;
    }
    
    public void setIsTracked(String isTracked) {
        this.isTracked = isTracked;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getMobilePhone() {
        return mobilePhone;
    }
    
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
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
    
    public String getSalesPerson() {
        return salesPerson;
    }
    
    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }
    
    public String getSubscriptionDate() {
        return subscriptionDate;
    }
    
    public void setSubscriptionDate(long dataLong) {
        String dataString = ConversaoDeData.getDateString(dataLong);
        subscriptionDate = dataString;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getUnsubscriptionDate() {
        return unsubscriptionDate;
    }
    
    public void setUnsubscriptionDate(long dataLong) {
        String dataString = ConversaoDeData.getDateString(dataLong);
        unsubscriptionDate = dataString;
    }
    
    public String getUpdateAt() {
        return updateAt;
    }
    
    public void setUpdateAt(long dataLong) {
        String dataString = ConversaoDeData.getDateString(dataLong);
        updateAt = dataString;
    }
    
    public String getUpdateBy() {
        return updateBy;
    }
    
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }    
    
}