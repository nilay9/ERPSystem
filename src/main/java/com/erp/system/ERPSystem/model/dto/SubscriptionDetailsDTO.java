package com.erp.system.ERPSystem.model.dto;

public class SubscriptionDetailsDTO {

    private String productName;
    private String subscriptionName;

    public SubscriptionDetailsDTO(String productName, String subscriptionName) {
        this.productName = productName;
        this.subscriptionName = subscriptionName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
}
