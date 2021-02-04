package com.test.eurekaconsumer.controller;

import com.test.eurekaconsumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Autowired
    private ProductService productService;

    @RequestMapping("getConsumer")
    public String getConsumere(){
        String product = productService.getProduct();
        return product;
    }
}
