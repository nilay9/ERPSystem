package com.erp.system.ERPSystem.service;

import com.erp.system.ERPSystem.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<String> getAllProduct() {
        return productRepo.findProductName();
    }
}
