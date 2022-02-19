package com.erp.system.ERPSystem.repository;

import com.erp.system.ERPSystem.model.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderDetails,Integer> {

}
