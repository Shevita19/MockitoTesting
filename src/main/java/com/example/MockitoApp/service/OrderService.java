package com.example.MockitoApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ProductService productService;

    public OrderService(ProductService productService) {
        this.productService = productService;
    }

    public String getProductName(){
        return productService.getProductName();
    }


}
