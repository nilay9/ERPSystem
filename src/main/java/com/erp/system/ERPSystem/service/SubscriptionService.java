package com.erp.system.ERPSystem.service;

import com.erp.system.ERPSystem.model.SubscriptionDetails;
import com.erp.system.ERPSystem.model.dto.SubscriptionDetailsDTO;

import java.util.List;
import java.util.Optional;

public interface SubscriptionService {

    List<SubscriptionDetailsDTO> getSubscriptionDetails();

    Optional<SubscriptionDetails> checkSubscriptionExist(Integer id);
}
