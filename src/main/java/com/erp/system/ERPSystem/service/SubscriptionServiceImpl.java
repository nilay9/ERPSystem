package com.erp.system.ERPSystem.service;

import com.erp.system.ERPSystem.model.SubscriptionDetails;
import com.erp.system.ERPSystem.model.dto.SubscriptionDetailsDTO;
import com.erp.system.ERPSystem.repository.SubscriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionServiceImpl implements SubscriptionService{

    @Autowired
    SubscriptionRepo subscriptionRepo;

    @Override
    public List<SubscriptionDetailsDTO> getSubscriptionDetails() {
        List<SubscriptionDetailsDTO> dtoList = new ArrayList<>();
        List<SubscriptionDetails> list = subscriptionRepo.findAll();
        for(SubscriptionDetails s : list) {
            dtoList.add(new SubscriptionDetailsDTO(s.getProductDetail().getProductName(),s.getSubscriptionName()));
        }
        return dtoList;
    }

    @Override
    public Optional<SubscriptionDetails> checkSubscriptionExist(Integer id) {
        return subscriptionRepo.findById(id);
    }
}
