package com.erp.system.ERPSystem.model;

import javax.persistence.*;

@Entity
@Table(name="subscription_details")
public class SubscriptionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "subscription_name")
    private String subscriptionName;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private ProductDetails productDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public ProductDetails getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetails productDetail) {
        this.productDetail = productDetail;
    }
}
