package com.erp.system.ERPSystem.service;

import com.erp.system.ERPSystem.request.NewOrderRequest;

public interface OrderService {

    String createOrder(String user, NewOrderRequest request);
}
