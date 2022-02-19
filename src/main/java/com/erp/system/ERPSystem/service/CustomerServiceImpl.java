package com.erp.system.ERPSystem.service;

import com.erp.system.ERPSystem.model.CustomerDetails;
import com.erp.system.ERPSystem.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepo customerRepo;

    @Override
    public CustomerDetails getUserDetails(String username, String password) {
        return customerRepo.findOneByUsernameAndPassword(username,password);
    }

    @Override
    public Optional<CustomerDetails> getUser(String user) {
        return customerRepo.findOneByUsername(user);
    }
}
