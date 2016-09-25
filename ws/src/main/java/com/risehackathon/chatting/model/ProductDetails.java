package com.risehackathon.chatting.model;


import sun.misc.BASE64Encoder;

public class ProductDetails {

    private Integer productId;
    private String productName;
    private Double price;
    private String imageSource;

    public ProductDetails(int productId, String productName,String imageSource, double price) {
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
}
