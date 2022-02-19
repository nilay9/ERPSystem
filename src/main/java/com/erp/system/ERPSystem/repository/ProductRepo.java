package com.erp.system.ERPSystem.repository;

import com.erp.system.ERPSystem.model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<ProductDetails,Integer> {

    @Query(value="select p.product_name from product_details p", nativeQuery = true)
    List<String> findProductName();
}
