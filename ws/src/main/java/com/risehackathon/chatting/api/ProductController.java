package com.risehackathon.chatting.api;

import com.risehackathon.chatting.jaxb.Product;
import com.risehackathon.chatting.model.OrderDetails;
import com.risehackathon.chatting.model.OrderResponse;
import com.risehackathon.chatting.model.ProductDetails;
import com.risehackathon.chatting.repository.ProductRepository;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/{productUrl}",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProductDetails(@PathVariable(value = "productUrl")String id){
        ProductDetails details =  productRepository.getProductDetail(Integer.valueOf(id));

        Product product = new Product();
        product.setImageSource(details.getImageSource());
        product.setProductId(details.getProductId());
        product.setProductName(details.getProductName());
        product.setPrice(details.getPrice());

        try {
          product.setImageSource(Base64.encode(FileUtils.readFileToByteArray(new File("C:/Users/xps/IdeaProjects/risechatservice/images/shoes.jpg"))));
        } catch (IOException e) {
            e.printStackTrace();
        }



        return product;
    }

    @RequestMapping(name = "/orderplacement",method = RequestMethod.POST)
    public OrderResponse orderProduct(OrderDetails details){
        return null;
    }


}
