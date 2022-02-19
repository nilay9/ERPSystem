package com.erp.system.ERPSystem.controller;

import com.erp.system.ERPSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/productDetails")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    ResponseEntity<List<String>> getAllProduct() {
        List<String> listProduct = productService.getAllProduct();
    return new ResponseEntity<>(listProduct, HttpStatus.OK);
    }

}
