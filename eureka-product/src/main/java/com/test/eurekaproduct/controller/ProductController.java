package com.test.eurekaproduct.controller;

import com.test.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("/getProduct")
    public String grtProduct(){
        System.out.println("我是生产者");
        Product product = new Product();
        return product.toString();
    }
}
