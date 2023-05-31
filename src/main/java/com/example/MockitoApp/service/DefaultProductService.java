package com.example.MockitoApp.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultProductService implements ProductService{

        @Override
        public String getProductName(){
            return "Maths Book";
        }
    }

