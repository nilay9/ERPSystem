package com.erp.system.ERPSystem.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_name")
    private String productName;

//    @OneToMany(mappedBy="subscription")
//    private Set<SubscriptionDetails> subscriptionDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

//    public Set<SubscriptionDetails> getSubscriptionDetails() {
//        return subscriptionDetails;
//    }
//
//    public void setSubscriptionDetails(Set<SubscriptionDetails> subscriptionDetails) {
//        this.subscriptionDetails = subscriptionDetails;
//    }
}
