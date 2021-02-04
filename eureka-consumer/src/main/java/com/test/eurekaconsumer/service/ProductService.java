package com.test.eurekaconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "product-server",path ="/product" )
public interface ProductService {
    @RequestMapping(value = "getProduct")
    String getProduct();
}
