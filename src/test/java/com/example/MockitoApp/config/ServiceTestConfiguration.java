package com.example.MockitoApp.config;

import com.example.MockitoApp.service.ProductService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class ServiceTestConfiguration {

    @Bean
    @Primary
    public ProductService mockproductService(){
        return Mockito.mock(ProductService.class);
    }
}
