package com.example.MockitoApp;

import com.example.MockitoApp.service.OrderService;
import com.example.MockitoApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MockitoAppApplication {

	@Autowired
	private ProductService productService;
	@Autowired
	private OrderService orderService;

//	@Autowired
//	public MockitoAppApplication(ProductService productService, OrderService orderService) {
//		this.productService = productService;
//		this.orderService = orderService;
//	}

	public static void main(String[] args) {
		SpringApplication.run(MockitoAppApplication.class, args);
	}

	public void run(String... args) {
		String productName = orderService.getProductName();
		System.out.println("Product Name: " + productName);
	}
}
