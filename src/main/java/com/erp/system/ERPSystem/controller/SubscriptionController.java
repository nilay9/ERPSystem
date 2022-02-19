package com.erp.system.ERPSystem.controller;

import com.erp.system.ERPSystem.model.dto.SubscriptionDetailsDTO;
import com.erp.system.ERPSystem.service.SubscriptionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subscriptionDetails")
public class SubscriptionController {

    @Autowired
    SubscriptionService subscriptionService;

    @GetMapping("subscription")
    ResponseEntity<List<SubscriptionDetailsDTO>> getSubscriptionDetails() throws JsonProcessingException {
        List<SubscriptionDetailsDTO> subscriptionList = subscriptionService.getSubscriptionDetails();
    return new ResponseEntity<List<SubscriptionDetailsDTO>>(subscriptionList, HttpStatus.OK);
    }
}
