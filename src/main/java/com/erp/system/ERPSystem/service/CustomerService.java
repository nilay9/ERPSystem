package com.erp.system.ERPSystem.service;

import com.erp.system.ERPSystem.model.CustomerDetails;

import java.util.Optional;

public interface CustomerService {

    CustomerDetails getUserDetails(String username, String password);

    Optional<CustomerDetails> getUser(String user);
}
