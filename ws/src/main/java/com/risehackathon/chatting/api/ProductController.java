package com.risehackathon.chatting.api;

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
    public @ResponseBody ProductDetails getProductDetails(@PathVariable(value = "productUrl")String id){

        ProductDetails details = new ProductDetails(Integer.valueOf(id),"Shoes",
                null,20.0f);

        productRepository.save(details);
        return productRepository.findOne(Integer.valueOf(id));

//        try {
//            pdetails.setImageSource(Base64.encode(FileUtils.readFileToByteArray(new File("C:/Users/xps/Documents/GitHub/risehackathon/risehackathon/images/shoes.jpg"))));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    @RequestMapping(name = "/orderplacement",method = RequestMethod.POST)
    public OrderResponse orderProduct(OrderDetails details){
        return null;
    }


}
