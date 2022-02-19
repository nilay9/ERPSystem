package com.erp.system.ERPSystem.service;

import com.erp.system.ERPSystem.model.CustomerDetails;
import com.erp.system.ERPSystem.model.OrderDetails;
import com.erp.system.ERPSystem.model.SubscriptionDetails;
import com.erp.system.ERPSystem.repository.OrderRepo;
import com.erp.system.ERPSystem.request.NewOrderRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    CustomerService customerService;

    @Autowired
    SubscriptionService subscriptionService;

    @Autowired
    OrderRepo orderRepo;

    @Override
    public String createOrder(String user, NewOrderRequest request) {
        try {
            Optional<CustomerDetails> userDetail = customerService.getUser(user);
            if(userDetail.isPresent()) {
                Optional<SubscriptionDetails> subscriptionDetail = subscriptionService.checkSubscriptionExist(Integer.valueOf(request.getSubscriptionId()));
                if(subscriptionDetail.isPresent()) {
                    OrderDetails order = new OrderDetails();
                    order.setSubscriptionId(subscriptionDetail.get().getId());
                    order.setUserId(userDetail.get().getId());
                    order.setInstallationAddress(request.getAddress());
                    order.setInstallationTime(LocalDateTime.parse(request.getTime(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                    orderRepo.save(order);
                    ObjectMapper mapper = new ObjectMapper();
                    return mapper.writeValueAsString(order);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
