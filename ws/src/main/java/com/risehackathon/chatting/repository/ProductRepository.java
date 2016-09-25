package com.risehackathon.chatting.repository;

import com.risehackathon.chatting.model.ProductDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface ProductRepository extends CrudRepository<ProductDetails,Integer> {
}
