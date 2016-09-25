package com.risehackathon.chatting.model;


import org.hibernate.annotations.GeneratorType;
import sun.misc.BASE64Encoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productId;
    private String productName;
    private Double price;
    private String imageSource;

    public ProductDetails(){}

    public  ProductDetails(int productId, String productName,String imageSource, double price) {
        this.productId = productId;
        this.price = price;
        this.imageSource = imageSource;
        this.productName = productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource){ this.imageSource = imageSource; }
}
