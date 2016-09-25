package com.risehackathon.chatting.repository;

import com.risehackathon.chatting.model.ProductDetails;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private Map<Integer,ProductDetails> map = new HashMap<Integer,ProductDetails>();

    public ProductRepository(){
        map.put(1,new ProductDetails(1,"Shoes",null,20.0f));
        map.put(2,new ProductDetails(2,"Mobile",null,40.0f));
    }


    public ProductDetails getProductDetail(Integer productId){
        return map.get(productId);
    }

}
