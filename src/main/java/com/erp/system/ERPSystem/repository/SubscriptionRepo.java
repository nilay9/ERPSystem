package com.erp.system.ERPSystem.repository;

import com.erp.system.ERPSystem.model.SubscriptionDetails;
import com.erp.system.ERPSystem.model.dto.SubscriptionDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionRepo extends JpaRepository<SubscriptionDetails,Integer> {

}
