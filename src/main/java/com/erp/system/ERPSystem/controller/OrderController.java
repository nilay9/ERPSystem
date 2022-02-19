package com.erp.system.ERPSystem.controller;

import com.erp.system.ERPSystem.request.NewOrderRequest;
import com.erp.system.ERPSystem.service.OrderService;
import com.erp.system.ERPSystem.service.RabbitProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@Validated
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    RabbitProducer rabbitProducer;

    @PostMapping("/createOrder")
    ResponseEntity<String> createOrder(Principal principal,@Valid @RequestBody NewOrderRequest request) {
        try {
            String user = principal.getName();
            String orderData = orderService.createOrder(user,request);
            if(orderData != null) {
                rabbitProducer.send(orderData);
                return new ResponseEntity<>("Order Success", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Order failed", HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Something Went Wrong!", HttpStatus.OK);
        }

    }
}
