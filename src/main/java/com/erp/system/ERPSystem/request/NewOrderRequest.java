package com.erp.system.ERPSystem.request;

import com.erp.system.ERPSystem.utils.CheckDateFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewOrderRequest {

    @NotNull(message = "name cannot be null")
    private String name;

    @NotNull
    @Size(min = 5, max = 50,message = "minimum length 5 and maximum length 50 allowed")
    private String address;

    @NotNull(message = "subscriber details cannot be null")
    private String subscriptionId;

    @CheckDateFormat(pattern = "dd/MM/yyyy HH:mm:ss",message = "incorrect time format")
    @NotNull
    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
