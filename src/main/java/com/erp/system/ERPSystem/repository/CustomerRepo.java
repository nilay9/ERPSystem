package com.erp.system.ERPSystem.repository;

import com.erp.system.ERPSystem.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerDetails,Integer> {

    CustomerDetails findOneByUsernameAndPassword(String username, String password);

    Optional<CustomerDetails> findOneByUsername(String user);
}
